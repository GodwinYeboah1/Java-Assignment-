package com.godwin.DriversLicence.Person;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Id>{

	Person findById(long id);

	
	
}
