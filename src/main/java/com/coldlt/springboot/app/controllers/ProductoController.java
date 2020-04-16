package com.coldlt.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coldlt.springboot.app.model.Producto;
import com.coldlt.springboot.app.services.IProductoService;


@CrossOrigin
@RestController
@RequestMapping({"/productos"})

public class ProductoController {
	@Autowired
	IProductoService service;
	@PostMapping 
	public Producto agregar (@RequestBody Producto producto) {
		return service.add(producto);
		
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.read(id);
	}

	@PutMapping(path= {"/{id}"})
	public void update(@RequestBody Producto producto) {
		service.update(producto);
		
	}

	@DeleteMapping(path= {"/{id}"})
	public void delete(@PathVariable Long id) {
		service.delete(id);
		
	}

	@GetMapping
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return service.getProductos();
	}
	
}
