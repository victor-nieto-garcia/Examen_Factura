package com.coldlt.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coldlt.springboot.app.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
