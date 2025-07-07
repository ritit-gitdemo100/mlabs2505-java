package com.mlabs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlabs.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findByAuthor(String author);

	Optional<Book> findByName(String name);

	boolean existsByAuthor(String author);

}
