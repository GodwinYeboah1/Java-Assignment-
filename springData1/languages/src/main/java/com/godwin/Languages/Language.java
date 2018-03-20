package com.godwin.Languages;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//	step 1
@Entity
public class Language {
//	make an id and increment the id value
	@Id
	@GeneratedValue
	private long id;

	@Size(min =2, max=20)
	private String name;
	
	@Size(min =2, max=20)
	private String creator;
	
	@NotNull
	private double currentVersion;
	 
//	without an empty contructor  the program will freak out 
	public Language() {
		
	}
	
	public Language(String name, String creator, Double currentVersion) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(Double currentVersion) {
		this.currentVersion = currentVersion;
	}

	
}
