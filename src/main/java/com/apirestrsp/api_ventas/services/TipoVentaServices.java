package com.apirestrsp.api_ventas.services;

import org.springframework.stereotype.Service;

import com.apirestrsp.api_ventas.models.TipoVenta;
import com.apirestrsp.api_ventas.repositories.TipoVentaRepository;

@Service
public class TipoVentaServices {
    private final TipoVentaRepository tipoVentaRepository;

    public TipoVentaServices(TipoVentaRepository tipoVentaRepository){
        this.tipoVentaRepository = tipoVentaRepository;
    }

    public TipoVenta guardarTipoVenta(TipoVenta tipoVenta){
        return tipoVentaRepository.save(tipoVenta);
    }

    }
