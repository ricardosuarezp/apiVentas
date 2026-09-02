package com.apirestrsp.api_ventas.services;

import org.springframework.stereotype.Service;

import com.apirestrsp.api_ventas.models.Roles;
import com.apirestrsp.api_ventas.repositories.RolesRepository;

@Service
public class RolesService {
    
    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
    }

    public Roles guardaRoles(Roles roles){
        return rolesRepository.save(roles);
    }

}
