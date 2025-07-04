package com.mlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlabs.entity.Product;
import com.mlabs.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@GetMapping
	public List<Product> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable int id){
		return repo.findById(id).get();
	}
	
	@PutMapping("/{id}")
	public Product update(@RequestBody Product newProduct, @PathVariable int id) {
		Product product = repo.findById(id).get();
		product.setName(newProduct.getName());
		product.setPrice(newProduct.getPrice());
		return repo.save(product);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
			repo.deleteById(id);
	}
}
