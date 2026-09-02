package com.apirestrsp.api_ventas.services;

import org.springframework.stereotype.Service;

import com.apirestrsp.api_ventas.models.Clientes;
import com.apirestrsp.api_ventas.repositories.ClientesRepository;

@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;
    
    public  ClientesService(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }
    public Clientes guardaClientes(Clientes clientes){
        return clientesRepository.save(clientes);
    }

}
