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
import com.mlabs.repository.BookRepository;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookRepository repo;

	@PostMapping
	public ResponseEntity<String> addNew(@RequestBody Book book) {
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("isLoggedIn", "true");
		httpHeaders.add("userId", "Emp1101");

		if (repo.findByName(book.getName()).isPresent())
			return new ResponseEntity<>("Book already exists", httpHeaders, HttpStatus.CONFLICT);

		repo.save(book);
		return new ResponseEntity<>("Book Inserted successfully", httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAll() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("isLoggeedIn", "true");
		httpHeaders.add("userId", "Emp1101");

		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(repo.findAll());
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("isLoggedIn", "true");
		httpHeaders.add("userId", "Emp1101");

		if (!repo.existsById(id))
			return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(httpHeaders).body("Book Id does not exists");

		return ResponseEntity.ok().headers(httpHeaders).body(repo.findById(id).get());
	}


	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Book newBook, @PathVariable long id) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("isLoggedIn", "true");
		httpHeaders.add("userId", "Emp1101");

		Optional<Book> bookOpt = repo.findById(id);
		if (bookOpt.isPresent()) {
			Book book = bookOpt.get();
			book.setName(newBook.getName());
			book.setAuthor(newBook.getAuthor());
			book.setPrice(newBook.getPrice());
			return ResponseEntity.ok().headers(httpHeaders).body(repo.save(book));
		}
		return ResponseEntity.notFound().headers(httpHeaders).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id) {

		Optional<Book> bookOpt = repo.findById(id);
		if (bookOpt.isPresent()) {
			repo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	

	@GetMapping("/byauthor/{author}")
	public ResponseEntity<?> findByAuthor(@PathVariable String author) {

		Optional<Book> book = repo.findByAuthor(author);
		
		return book.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
