package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer>{
    
}
