package com.godwin.relationships.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;
// imported  models and my Product Repository so i can make crud methods
import com.godwin.relationships.Repository.ProductRepository;
import com.godwin.relationships.models.Product;

@Service
public class ProductService {
//	a  wrapper from the Repostory that help me make crud
	private ProductRepository ProductRepository;
	
	public ProductService(ProductRepository  productRepository) {
		this.ProductRepository = productRepository;
	}
	
	
	public void create(Product product) {
		ProductRepository.save(product);
	}
//	returning all category need to be an arraylist data
//	because it can store object
	public ArrayList<Product> all(){
		return (ArrayList<Product>) ProductRepository.findAll();
	}
	
	public  Optional<Product> find(Long  Id) {
		return ProductRepository.findById(Id);
	}
	public void update(Product update) {
		ProductRepository.save(update);
	}
	
	public void destory(Product product) {
		ProductRepository.delete(product);
	}
	
	
}
