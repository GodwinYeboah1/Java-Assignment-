package com.godwin.DriversLicence.Licence;

import org.springframework.data.repository.CrudRepository;

import com.godwin.DriversLicence.Person.Person;

public interface LicenceRepository extends CrudRepository {

	void deleteById(Person person);

}
