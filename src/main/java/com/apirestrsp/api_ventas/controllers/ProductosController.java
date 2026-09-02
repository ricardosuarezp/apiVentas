package com.apirestrsp.api_ventas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.ProductosRequestDTO;
import com.apirestrsp.api_ventas.dto.ProductosResponseDTO;
import com.apirestrsp.api_ventas.models.Productos;
import com.apirestrsp.api_ventas.services.ProductosServices;


@RestController
@RequestMapping("/api/productos")
public class ProductosController {
    private final ProductosServices productosServices;

    public ProductosController(ProductosServices productosServices){
        this.productosServices = productosServices;
    }
    @PostMapping
    public ProductosResponseDTO guardarProductos(@RequestBody ProductosRequestDTO productosRequestDTO) {
        Productos productosNuevo = new Productos();
        productosNuevo.setNombreProducto(productosRequestDTO.getNombreProducto());
        productosNuevo.setStock(productosRequestDTO.getStock());
        productosNuevo.setPrecio(productosRequestDTO.getPrecio());
        productosNuevo.setEstado(productosRequestDTO.getEstado());
        
        Productos productoGuardado =productosServices.guardarProductos(productosNuevo);
        ProductosResponseDTO productosResponseDTO = new ProductosResponseDTO();
        productosResponseDTO.setIdProducto(productoGuardado.getIdProducto());
        productosResponseDTO.setNombreProducto(productoGuardado.getNombreProducto());
        productosResponseDTO.setStock(productoGuardado.getStock());
        productosResponseDTO.setPrecio(productoGuardado.getPrecio());
        productosResponseDTO.setEstado(productoGuardado.getEstado());
        
        return productosResponseDTO;
    }
    
    
}
