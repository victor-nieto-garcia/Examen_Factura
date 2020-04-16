package com.coldlt.springboot.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coldlt.springboot.app.model.Producto;
import com.coldlt.springboot.app.repository.ProductoRepository;



@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	ProductoRepository repo;
	
	public Producto add(Producto producto) {
		return repo.save(producto);
		
	}

	public Producto read(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	
	public void update(Producto producto) {
		repo.save(producto);
		
	}

	
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

}
