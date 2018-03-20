package com.godwin.Languages;

import java.util.ArrayList;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
//step 3
//check errors at this step for any errors
@Transactional
@Service
public class LanguageService {
//	we need to have access to the repository 
//	let us access 
//	languageRepository is a wrapper that comes with the  update, find ,delete and save methods 
//	that are essential for the database
//	LanguageRepository is an Object 
	private LanguageRepository lR;
//	we want to inject the Repository to this contructor so when it is called it will instanly have those methods
	
	public LanguageService(LanguageRepository lR) {
		this.lR = lR;
	}
//	in the create method we give the type first which is Language 
	public void create(Language language) {
//		because of the Repository wrapper and because it is in inject in the LanguageService construct
//		we can use the data methods to save it to the database 
//		this line bellow is inserting it in my mysql 
		lR.save(language);
		
	}
//	(type)  (ReturnType)  (methodName) (block of code)
//	 long allow me to store greater amount of intergers 
//	you might have 8million id
	public Language find(Long id) {
//		has to be findById to get the current id 
//		every time i use a find byAll id use .orElse(null)
		return lR.findById(id).orElse(null);
	}
	
//	how do we get all Languages 
//	database  we can have a return  type of  Array
	public ArrayList<Language> all() {
//		casting what the data we get back from the database 
		return (ArrayList<Language>) lR.findAll();
	}
//	create an update methods 
	public void update(Language language) {
//		update is override because the id already exist 
//		what are you saving ? =>>language
		lR.save(language);
	}
	
	
//	this method will delete in my controller
//	if we long can not have a null id 
//	however Long can have a null id 
	public void destory(Long id) {
		lR.deleteById(id);
	}
	

	
	
	
}



