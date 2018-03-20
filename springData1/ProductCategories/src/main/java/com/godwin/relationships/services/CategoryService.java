package com.godwin.relationships.services;
import com.godwin.relationships.models.Category;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.godwin.relationships.Repository.CategoryRepository;
@Service
public class CategoryService {

//	db methods which are wrapper that help crud
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository  categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	
	public void create(Category cat) {
		categoryRepository.save(cat);
	}
//	returning all category need to be an arraylist data
//	because it can store object
	public ArrayList<Category> all(){
		return (ArrayList<Category>) categoryRepository.findAll();
	}
	
	public  Optional<Category> find(Long  Id) {
		return categoryRepository.findById(Id);
	}
	public void update(Category update) {
		categoryRepository.save(update);
	}
	
	public void destory(Category cat) {
		categoryRepository.delete(cat);
	}
	
	
}
