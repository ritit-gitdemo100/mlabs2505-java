package com.mlabs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlabs.entity.Book;
import com.mlabs.exception.AlreadyExistException;
import com.mlabs.exception.NegativeInputException;
import com.mlabs.exception.NotFoundException;
import com.mlabs.repository.BookRepository;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookRepository repo;

	@PostMapping
	public ResponseEntity<String> addNew(@RequestBody Book book) {
		
		if (repo.findByName(book.getName()).isPresent())
			throw new AlreadyExistException("Book already exists");

		repo.save(book);
		return new ResponseEntity<>("Book Inserted successfully", HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAll() {

		return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		
		if(id < 0)
			throw new NegativeInputException("Book id cannot be a negative number");

		if (repo.existsById(id))
			return ResponseEntity.ok().body(repo.findById(id).get());
		else
			throw new NotFoundException("Book Id doesnt exist");
	}


	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Book newBook, @PathVariable long id) {

		Optional<Book> bookOpt = repo.findById(id);
		if (bookOpt.isPresent()) {
			Book book = bookOpt.get();
			book.setName(newBook.getName());
			book.setAuthor(newBook.getAuthor());
			book.setPrice(newBook.getPrice());
			return ResponseEntity.ok(repo.save(book));
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id) {

		Optional<Book> bookOpt = repo.findById(id);
		if (bookOpt.isPresent()) {
			repo.deleteById(id);
			return ResponseEntity.ok("");
		}
		return ResponseEntity.notFound().build();
	}
	

	@GetMapping("/byauthor/{author}")
	public ResponseEntity<?> findByAuthor(@PathVariable String author) {

		Optional<Book> book = repo.findByAuthor(author);
		
		return book.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
