package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
    
}
