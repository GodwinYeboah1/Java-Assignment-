package com.godwin.relationships.models;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.godwin.relationships.models.Category;
import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	@Id
	@GeneratedValue
	private long id;
	
	@Size(min=1, max=255)
	private String name;
	@Size(min=1, max=1024)
	private String description;
	@NotNull
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date updatedAt;
	
	@JoinTable(
//			name has to match other model joinning
			name="categories_products",
			joinColumns = @JoinColumn(name="product_id")	,
			inverseJoinColumns=@JoinColumn(name="category_id")
			)
//	you want this here to store the data 
//	and return it 
	private List<Category> categories;
			
	
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	private double price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		this.createdAt = new Date();
		this.updatedAt = new Date();

	}
	 

}
