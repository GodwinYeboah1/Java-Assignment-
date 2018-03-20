package com.godwin.GroupLanguages.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

// were i create my tables

//step 1
public class Language {
	
	@Size(min=2 , max=20)
	private String name;
	@Size(min=2 , max=20)
	private String creator;
	@Size(min=1 , max=255)
	private String currentVersion;
	
	public Language() {
		
	}
	
	public Language(String name, String creator, String currentVersion) {
		super();
		this.name = name;
		this.creator = creator;
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

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
}
