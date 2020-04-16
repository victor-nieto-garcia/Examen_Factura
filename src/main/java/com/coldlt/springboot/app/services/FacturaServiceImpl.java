package com.coldlt.springboot.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coldlt.springboot.app.model.Factura;
import com.coldlt.springboot.app.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	FacturaRepository repo;
	
	public void create (Factura factura) {
		repo.save(factura);
		
	}

	public Factura read(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	
	public void update(Factura factura) {
		repo.save(factura);
		
	}

	
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	
	public List<Factura> getFacturas() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	


}
