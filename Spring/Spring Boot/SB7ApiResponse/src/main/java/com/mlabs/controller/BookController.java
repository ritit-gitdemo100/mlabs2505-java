package com.mlabs.controller;

import com.mlabs.entity.Book;
import com.mlabs.exception.AlreadyExistException;
import com.mlabs.exception.NegativeInputException;
import com.mlabs.exception.NotFoundException;
import com.mlabs.payload.ApiResponse;
import com.mlabs.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repo;

    @PostMapping
    public ResponseEntity<ApiResponse<String>> addNew(@RequestBody Book book) {
        if (repo.findByName(book.getName()).isPresent()) {
            throw new AlreadyExistException("Book already exists");
        }

        repo.save(book);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ApiResponse<>(201, "Book inserted successfully", null));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Book>>> findAll() {
        List<Book> books = repo.findAll();
        return ResponseEntity.ok(new ApiResponse<>(200, "Books fetched successfully", books));
    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<ApiResponse<Book>> findById(@PathVariable long id) {
        if (id < 0) {
            throw new NegativeInputException("Book id cannot be a negative number");
        }

        Book book = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Book Id does not exist"));

        return ResponseEntity.ok(new ApiResponse<>(200, "Book fetched", book));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Book>> update(@RequestBody Book newBook, @PathVariable long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Book not found for update"));

        book.setName(newBook.getName());
        book.setAuthor(newBook.getAuthor());
        book.setPrice(newBook.getPrice());

        Book updated = repo.save(book);
        return ResponseEntity.ok(new ApiResponse<>(200, "Book updated successfully", updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> delete(@PathVariable long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Book not found for deletion"));

        repo.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(200, "Book deleted successfully", null));
    }

    @GetMapping("/byauthor/{author}")
    public ResponseEntity<ApiResponse<Book>> findByAuthor(@PathVariable String author) {
        Book book = repo.findByAuthor(author)
                .orElseThrow(() -> new NotFoundException("Book with this author not found"));

        return ResponseEntity.ok(new ApiResponse<>(200, "Book fetched by author", book));
    }
}
