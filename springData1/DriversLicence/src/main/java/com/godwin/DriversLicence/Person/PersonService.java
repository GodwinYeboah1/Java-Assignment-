package com.godwin.DriversLicence.Person;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

//	do all my crud operation for person

	private PersonRepository PersonRepository;
	public PersonService(PersonRepository PersonRepository) {
		
		this.PersonRepository= PersonRepository;
		
	}
	private ArrayList<Person> Persons = new ArrayList<>();
	
	public ArrayList<Person> all(){
		return Persons;
	}
	
	
	public Person getAllPerson() {
		return (Person) PersonRepository.findAll();
	}
	
	public Person getbyID(long id){
			return PersonRepository.findById(id);
	}
	
	public void createPerson(Person person) {
		PersonRepository.save(person);
	}
	
	
	
	
	
}