package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.TipoVenta;

public interface TipoVentaRepository extends JpaRepository<TipoVenta, Integer> {
    
}
