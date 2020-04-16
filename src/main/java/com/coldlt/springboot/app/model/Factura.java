package com.coldlt.springboot.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cliente;

	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "factura_id")
	private List<Item> items;
	private double ValorTotalF;

	public double getValorTotalF() {
		return ValorTotalF;
	}

	public void setValorTotalF(double valorTotalF) {
		ValorTotalF = valorTotalF;
	}

	public Factura(Long id, String cliente, List<Item> items, double valorTotalF) {
		this.id = id;
		this.cliente = cliente;
		this.items = items;
		ValorTotalF = valorTotalF;
	}

	public Factura() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	

	private static final long serialVersionUID = 1L;
}
