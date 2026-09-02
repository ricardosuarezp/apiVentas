package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer>{
    
}
