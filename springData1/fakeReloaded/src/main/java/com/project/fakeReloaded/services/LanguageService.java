package com.project.fakeReloaded.services;

import java.util.ArrayList;
import java.util.List;

import com.project.fakeReloaded.models.language;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class LanguageService {
	// Member variables / service initializations go here
	// fake id need a new arraylist
	// all member keep private 
	private ArrayList<language> languagesDB = new ArrayList<>();


	// all my crud methods
	public LanguageService(){

	}

	// accessing all the lang our db 

	// returninng our database
	public ArrayList<language> getAll(){

		return this.languagesDB;
	}


	public language getLanguageById(int index ){
		// get object from array list
		return languagesDB.get(index);
	}

	public  void  deleteById(int index){
		languagesDB.remove(index);
	}

	public void updateById(int index, language lang){
		
		languagesDB.set(index, lang);
	}

	public void create(language lang){
		languagesDB.add(lang);
	}


	
	// Crud methods to act on services go here.
}
