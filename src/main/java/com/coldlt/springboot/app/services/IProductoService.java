package com.coldlt.springboot.app.services;

import java.util.List;

import com.coldlt.springboot.app.model.Producto;

public interface IProductoService {
	public Producto add(Producto producto);
	public Producto read(Long id);
	public void update (Producto producto);
	public void delete (Long id);
	public List<Producto> getProductos();

}
