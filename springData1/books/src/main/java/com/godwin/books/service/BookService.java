package com.godwin.books.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.godwin.books.models.Book;

@Service
public class BookService {
//	grabbing all the created book and store in book  
	 List<Book> books = new ArrayList<Book>(Arrays.asList(
	            new Book("Harry Potter and the godwin yeboah", "A boy wizard saving the world", "english", 309),
	            new Book("The Great Godwin", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
	            new Book("The Great Godwin", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180)

	            	  ));
	 
	 
//	 returning all books 
	 public List<Book> allbook(){
		 return books;
	 }
	
	public Book findBookByIndex(int index) {
		
		if(index < books.size()) {
			return books.get(index);
			}else {
				return null;
			}
		}
	public void addBook(Book book) {
		books.add(book);
		
	}
	
	public void updateBook(int id ,Book book) {
		if(id < books.size()) {
//			db own function that i dont have to create
			books.set(id, book);
		}
	}
	
	public void destoryBook(int id) {
		if(id< books.size()) {
			books.remove(id);
		}
		
	}
	 
	
}
