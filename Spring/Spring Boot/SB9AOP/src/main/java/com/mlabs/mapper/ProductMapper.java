package com.mlabs.mapper;

import org.springframework.stereotype.Component;

import com.mlabs.dto.request.ProductRequest;
import com.mlabs.dto.response.ProductResponse;
import com.mlabs.entity.Product;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return new Product(request.getId(), request.getName(), request.getPrice());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }
}
