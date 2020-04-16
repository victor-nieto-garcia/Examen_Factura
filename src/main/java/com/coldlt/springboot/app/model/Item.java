package com.coldlt.springboot.app.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

@Entity
public class Item implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(targetEntity = Producto.class, cascade = CascadeType.ALL)
	private Producto producto;
	private Integer Cantidad;
	private double valorTotal;

	

	public Item(long id, Producto producto, Integer cantidad, double valorTotal) {
		this.id = id;
		this.producto = producto;
		Cantidad = cantidad;
		this.setValorTotal(valorTotal);
	}
	

	public Item() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	@PrePersist
	public void valorTotal() {
	this.setValorTotal(Cantidad.doubleValue() * producto.getValor()); 
	}

	private static final long serialVersionUID = 1L;

}
