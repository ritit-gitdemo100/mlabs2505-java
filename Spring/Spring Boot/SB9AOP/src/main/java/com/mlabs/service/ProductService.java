package com.mlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlabs.dto.request.ProductRequest;
import com.mlabs.dto.response.ProductResponse;
import com.mlabs.entity.Product;
import com.mlabs.exception.ProductNotFoundException;
import com.mlabs.mapper.ProductMapper;
import com.mlabs.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;

    public ProductResponse getProduct(Long id) {
        Product product = repository.findById(id)
        		.orElseThrow(() -> new ProductNotFoundException("Product not found: " + id));
        return mapper.toResponse(product);
    }

    public ProductResponse createProduct(ProductRequest request) {
        Product saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
