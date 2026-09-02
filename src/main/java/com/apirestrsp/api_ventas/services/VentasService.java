package com.apirestrsp.api_ventas.services;

import org.springframework.stereotype.Service;

import com.apirestrsp.api_ventas.models.Ventas;
import com.apirestrsp.api_ventas.repositories.VentasRepository;

@Service
public class VentasService {
    private final VentasRepository ventasRepository;

    public VentasService(VentasRepository ventasRepository){
        this.ventasRepository = ventasRepository;
    }
    public Ventas guardarVentas(Ventas ventas){
        if(ventas.getVentasDetalles() != null){
            ventas.getVentasDetalles().forEach(detalle ->{
                detalle.setIdVentas(ventas);
            });
        }
        return ventasRepository.save(ventas);
    }
}
