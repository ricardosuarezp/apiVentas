package com.apirestrsp.api_ventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestrsp.api_ventas.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
