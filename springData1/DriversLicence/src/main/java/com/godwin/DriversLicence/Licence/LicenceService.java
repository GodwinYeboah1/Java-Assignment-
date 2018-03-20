package com.godwin.DriversLicence.Licence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godwin.DriversLicence.Person.Person;

@Service
public class LicenceService {
//crud 

	private LicenceRepository LicenceRepository;
	
	public LicenceService(LicenceRepository LicenceRepository) {
		this.LicenceRepository = LicenceRepository;
	}
	
	 List <Licence> licences= new ArrayList<>();
	
	 public List<Licence> getAll(){
		 return licences; 
	 }
	 
	 
	  public void create(Person person) {
		  LicenceRepository.save(person);
		
	 }
	  public void destory(Person person) {
		  LicenceRepository.deleteById(person);
		 }
	 
	  public void update(Person person) {
		  LicenceRepository.save(person);
		 }
}
