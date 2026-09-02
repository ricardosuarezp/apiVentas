package com.apirestrsp.api_ventas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.ClientesRequestDTO;
import com.apirestrsp.api_ventas.dto.ClientesResponseDTO;
import com.apirestrsp.api_ventas.models.Clientes;
import com.apirestrsp.api_ventas.services.ClientesService;


@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    private final ClientesService clientesService;
    public ClientesController(ClientesService clientesService){
        this.clientesService = clientesService;
    }
    
    @PostMapping()
    public ClientesResponseDTO guardarClientes(@RequestBody ClientesRequestDTO clientesRequestDTO) {
        Clientes clienteNuevo = new Clientes();
         clienteNuevo.setNombres(clientesRequestDTO.getNombres());
         clienteNuevo.setCorreo(clientesRequestDTO.getCorreo());
         clienteNuevo.setTelefono(clientesRequestDTO.getTelefono());
         clienteNuevo.setDireccion(clientesRequestDTO.getDireccion());
         clienteNuevo.setEstado(clientesRequestDTO.getEstado());

         Clientes clienteGuardado = clientesService.guardaClientes(clienteNuevo);

         ClientesResponseDTO clientesResponseDTO = new ClientesResponseDTO();
         clientesResponseDTO.setIdCliente(clienteGuardado.getIdCliente());
         clientesResponseDTO.setNombres(clienteGuardado.getNombres());
         clientesResponseDTO.setCorreo(clienteGuardado.getCorreo());
         clientesResponseDTO.setTelefono(clienteGuardado.getTelefono());
         clientesResponseDTO.setDireccion(clienteGuardado.getDireccion());
         clientesResponseDTO.setEstado(clienteGuardado.getEstado());

        
        return clientesResponseDTO;
    }
    
}
