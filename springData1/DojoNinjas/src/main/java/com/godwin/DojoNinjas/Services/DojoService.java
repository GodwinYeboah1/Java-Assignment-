package com.godwin.DojoNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.godwin.DojoNinjas.Repository.DojoRepository;
import com.godwin.DojoNinjas.models.Dojo;

@Service
public class DojoService {
//	import my crudRep methods
	private DojoRepository dojoRepository;
	public Optional<Dojo> find(Long id ) {
		return dojoRepository.findById(id);
	}
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
//	read
	public List<Dojo> getAll(){
		return (List<Dojo>) dojoRepository.findAll();
		
	}
//	create
	public void create(Dojo dojo) {
		dojoRepository.save(dojo);
	}
//	update 
	public void update(Dojo dojo) {
		dojoRepository.save(dojo);
	}
//	delete
	public void destory(Long id ) {
		dojoRepository.deleteById(id);
	}
		
}
