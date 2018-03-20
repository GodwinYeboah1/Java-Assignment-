
//	
	

//package com.godwin.books.controller;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.godwin.books.models.Book;
//import com.godwin.books.service.BookService;
//
//@Controller 
//public class controller {
//	private final BookService bookService;
//	
//	public controller(BookService bookService) {
//		this.bookService = bookService;
//	}
//	
////		
//	
//	
//		
//	
//			// ...
//		    @PostMapping("/books/new")
////		    i spelled book wrong to check the binding the model
//		    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result ) {
//		    	
//		    		if(result.hasErrors()) {
////		    			you are at the same page
//		    			return "newBook";
//		    		}else {
////		    			add the new books
//		    			bookService.addBook(book);
//		    			return "redirect:/books";
//		    		}
//		     
//		    }
//		    
////		
////		    form to get the edit page with a get verb
//		    @RequestMapping("books/edit/{id}")
//		    public String editbook(@PathVariable("id") int id, Model model) {
////		    		we need to find the index(id) first to  edit the data
//		    		Book book = bookService.findBookByIndex(id);
//		    		
////		    		meaning if the book id easiest in db that we stored in a book var 
//		    		if(book != null) {
//		    			model.addAttribute("book", book);
//		    			return "editBook";
//		    		}else {
////		    			we send to books because ID does not exist in the db 
//		    			return "redirect:/books";
//		    		}
//		    	
//		    		
//		    		
//		    }
////		    to update the post data to edit books
////		    handle the post data
//		    @PostMapping("books/edit/{id}")
//		    public String updateBook(@PathVariable("id") int id, @Valid @ModelAttribute("book")Book book, BindingResult result) {
//		    		if(result.hasErrors()) {
//		    			return "editBook";
//		    		}else {
////		    			we are calling on bookService to call on the db so we can edit the info
//		    			bookService.updateBook(id, book);
//		    			return "redirect:/books";
//		    		}
//		 
//		    }
////		    deleting data 
////		    we need to first get to that file we do that by the route
//		    
//		   @RequestMapping(value="/books/delete/{id}")
//		   public String destoryBook(@PathVariable("id") int id) {
//			   bookService.destoryBook(id);
//			   	return "redirect:/books";
//		   }
//		    	
//		    	
//		    
//		    
//// ...
//
////	
//		   @RequestMapping("/books")
//		   	public String book(Model model) {
//			   List<Book> books = bookService.allbook();
//			   model.addAttribute("books", books);
//			   return "books";
//		   }
//			        
//	        @RequestMapping("/bookslist")
//	        public String booklist(Model model) {
//	     	List<Book> books = bookService.allbook();
//	     	model.addAttribute("books", books);
//	     	return "booklist";
//	 
//   }
//	        @RequestMapping("/booksdiv")
//	        public String bookDiv(Model model) {
//	        	
//	     	List<Book> books = bookService.allbook();
//	     	model.addAttribute("books", books);
//	     	return "bookdiv";
//	        }
//	     	
////	     	 finding one book by it id 
//	     	@RequestMapping("/book/{id}")
//	     	public String findIndexById(Model model,  @PathVariable("id") int index){
//	     		Book book = bookService.findBookByIndex(index);
//	     		System.out.println(index);
//	     		model.addAttribute("book", book);
//	     		
//	     		return "showbooks";
//	     		
//	     	}
//	     	
//	     	
//	     	
//	     	
//	     	
//	     	
//	     	
//	     	
//	     	
//	     	
//   }
//	
//	
//	
//	