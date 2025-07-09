package com.mlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlabs.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
