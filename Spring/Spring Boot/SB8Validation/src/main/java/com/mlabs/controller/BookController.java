package com.mlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlabs.repository.BookRepository;
import com.mlabs.request.CreateBookRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repo;

    @PostMapping
    public CreateBookRequest addNew(@Valid @RequestBody CreateBookRequest bookReq) {
    	return bookReq;
    }

    
}
