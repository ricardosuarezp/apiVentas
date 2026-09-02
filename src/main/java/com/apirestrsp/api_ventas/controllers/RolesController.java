package com.apirestrsp.api_ventas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.RolesRequestDTO;
import com.apirestrsp.api_ventas.dto.RolesResponseDTO;
import com.apirestrsp.api_ventas.models.Roles;
import com.apirestrsp.api_ventas.services.RolesService;


@RestController
@RequestMapping("/api/roles")
public class RolesController {
    
    private final RolesService rolesService;
    public RolesController(RolesService rolesService){
        this.rolesService = rolesService;
    }
    @PostMapping
    public RolesResponseDTO guardarRoles(@RequestBody RolesRequestDTO requestDTO){
        Roles rolNuevo =new Roles();
        rolNuevo.setDescripcionRol(requestDTO.getDescripcionRol());
        rolNuevo.setEstado(requestDTO.getEstado());

        Roles rolGuardado = rolesService.guardaRoles(rolNuevo);

        RolesResponseDTO responseDTO = new RolesResponseDTO();
        responseDTO.setIdRol(rolGuardado.getIdRol());
        responseDTO.setDescripcionRol(rolGuardado.getDescripcionRol());
        responseDTO.setEstado(rolGuardado.getEstado());
        return responseDTO;
    }

}
