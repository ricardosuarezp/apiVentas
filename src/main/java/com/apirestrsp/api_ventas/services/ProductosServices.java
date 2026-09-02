package com.apirestrsp.api_ventas.services;

import org.springframework.stereotype.Service;

import com.apirestrsp.api_ventas.models.Productos;
import com.apirestrsp.api_ventas.repositories.ProductosRepository;

@Service
public class ProductosServices {
    private final ProductosRepository productosRepository;

    public ProductosServices(ProductosRepository productosRepository){
        this.productosRepository = productosRepository;
    }

    public Productos guardarProductos(Productos productos){
        return productosRepository.save(productos);
    }
}
