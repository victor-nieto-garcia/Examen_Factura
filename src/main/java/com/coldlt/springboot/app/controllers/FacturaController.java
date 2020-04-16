package com.coldlt.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coldlt.springboot.app.model.Factura;
import com.coldlt.springboot.app.model.Item;
import com.coldlt.springboot.app.services.IFacturaService;





@RestController
@RequestMapping("/factura")
public class FacturaController {
	@Autowired
	IFacturaService service;
	
	@PostMapping
	public void create(@RequestBody Factura factura) {
		service.create(factura);	
	/*	double t=0.0;
		int size = factura.getItems().size();
		
		for (int i=0;i<factura.getItems().size();i++) {
			
			t=factura.getItems(i).getValorTotal()+t;
		}
		
		factura.setValorTotalF(t);
	
	} */
	}
		
	
	@GetMapping("/{id}")
	public Factura read(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.read(id);
		
	}

	@PutMapping
	public void update(@RequestBody Factura factura) {
		service.update(factura);
		
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
		
	}

	@GetMapping
	public List<Factura> getFacturas() {
		// TODO Auto-generated method stub
		return service.getFacturas();
	}
	

	

	
}
