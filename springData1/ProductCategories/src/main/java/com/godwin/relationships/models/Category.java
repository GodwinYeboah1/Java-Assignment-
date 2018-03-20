package com.godwin.relationships.models;

import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import com.godwin.relationships.models.Product;
import org.springframework.format.annotation.DateTimeFormat;

public class Category {
	@Id
	@GeneratedValue
	private long id;
	
	@Size(min=1, max=255)
	private String name;
	@DateTimeFormat(pattern = "MM:dd:yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "MM:dd:yyyy HH:mm:ss")
	private Date updatedAt;
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		
	name="categories_products",
	joinColumns = @JoinColumn(name="category_id")	,
	inverseJoinColumns=@JoinColumn(name="product_id")
	)
	private List<Product> product;


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


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	
	
}
