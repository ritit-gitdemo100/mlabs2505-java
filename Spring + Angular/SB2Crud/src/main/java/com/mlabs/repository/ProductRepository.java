package com.mlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mlabs.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
