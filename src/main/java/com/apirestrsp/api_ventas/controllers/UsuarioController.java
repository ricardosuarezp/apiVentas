package com.apirestrsp.api_ventas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.UsuarioRequestDTO;
import com.apirestrsp.api_ventas.dto.UsuarioResponseDTO;
import com.apirestrsp.api_ventas.models.Roles;
import com.apirestrsp.api_ventas.models.Usuario;
import com.apirestrsp.api_ventas.services.RolesService;
import com.apirestrsp.api_ventas.services.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final RolesService rolesService;

    public UsuarioController(UsuarioService usuarioService, RolesService rolesService) {
        this.usuarioService = usuarioService;
        this.rolesService = rolesService;
    }

    @PostMapping
    public UsuarioResponseDTO guardarUsuario(@RequestBody UsuarioRequestDTO requestDTO) {
        
        Roles rolEncontrado = rolesService.buscarRolesPorId(requestDTO.getIdRol());

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario(requestDTO.getNombreUsuario());
        nuevoUsuario.setPassword(requestDTO.getPassword());
        nuevoUsuario.setIdRol(rolEncontrado); 

        Usuario usuarioGuardado = usuarioService.guardarUsuario(nuevoUsuario);

        UsuarioResponseDTO responseDTO = new UsuarioResponseDTO();
        responseDTO.setIdUsuario(usuarioGuardado.getIdUsuario());
        responseDTO.setNombreUsuario(usuarioGuardado.getNombreUsuario());
        responseDTO.setIdRol(rolEncontrado.getIdRol());
        responseDTO.setEstado(usuarioGuardado.getEstado());

        return responseDTO;
    }
}