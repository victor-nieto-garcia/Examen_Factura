package com.coldlt.springboot.app.services;

import java.util.List;

import com.coldlt.springboot.app.model.Factura;

public interface IFacturaService {
	public void create(Factura factura);
	public Factura read(Long id);
	public void update (Factura factura);
	public void delete (Long id);
	public List<Factura> getFacturas();


}
