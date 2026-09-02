package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {
    
}
