package com.project.fakeReloaded.models;

import java.util.Date;
import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
// import javax.persistence.OneToMany;
// import javax.persistence.PrePersist;

import javax.validation.constraints.Size;
import javax.validation.constraints.Min;


import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;


public class language{
	
	// Member variables and annotations go here.

	// default for validtion methods
	@Size(min = 3, max = 20 , message="Wrong!!")
    private String name;
    
    @Size(min = 5, max = 200 ,message="Wrong!!")
    private String creator;
    
    @Min(0)
    private int version;
    
	public language(){

	}
	// this creates objects
	public language(String name, String creator, int version){
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	// setter void ()
	public void setName(String name){
		this.name = name;
	}
	public void setCreator(String creator){
		this.name = creator;
	}
	public void setversion(int version) {
		this.version= version;
	}

	// getter
	public String getName(){
		return name;
	}
	public String getCreator(){
		return creator;
	}
	public int getversion(){
		return version;
	}

}
