package com.godwin.DojoNinjas.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.godwin.DojoNinjas.Repository.NinjaRepository;
import com.godwin.DojoNinjas.models.Ninja;

@Service
public class NinjaService {

	private NinjaRepository NinjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.NinjaRepository = ninjaRepository;
	}
//create 
	public void create(Ninja ninja) {
		NinjaRepository.save(ninja);
	}
	
//read 
	public List<Ninja> findAll(){
		return (List<Ninja>) NinjaRepository.findAll();
	}
	
//update
	public void update(Ninja ninja) {
		NinjaRepository.save(ninja);
	}
//delete 
	
	public void destory(Ninja ninja) {
		NinjaRepository.delete(ninja);
	}
}
