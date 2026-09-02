package com.apirestrsp.api_ventas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.TipoVentaRequestDTO;
import com.apirestrsp.api_ventas.dto.TipoVentaResponseDTO;
import com.apirestrsp.api_ventas.models.TipoVenta;
import com.apirestrsp.api_ventas.services.TipoVentaServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tipo_venta")
public class TipoVentaController {
    private final TipoVentaServices tipoVentaServices;

    public TipoVentaController(TipoVentaServices tipoVentaServices){
        this.tipoVentaServices = tipoVentaServices;
    }

    @PostMapping
    public  TipoVentaResponseDTO guardarTipoVenta(@RequestBody TipoVentaRequestDTO tipoVentaRequestDTO) {

        TipoVenta nuevoTipoVenta = new TipoVenta();
        nuevoTipoVenta.setDescripcionTipoVenta(tipoVentaRequestDTO.getDescripcionTipoVenta());
        nuevoTipoVenta.setEstado(tipoVentaRequestDTO.getEstado());

        TipoVenta tipoVentaGuardado = tipoVentaServices.guardarTipoVenta(nuevoTipoVenta);

        TipoVentaResponseDTO tipoVentaResponseDTO = new TipoVentaResponseDTO();
            tipoVentaResponseDTO.setIdTipoVenta(tipoVentaGuardado.getIdTipoVenta());
            tipoVentaResponseDTO.setDescripcionTipoVenta(tipoVentaGuardado.getDescripcionTipoVenta());
            tipoVentaResponseDTO.setEstado(tipoVentaGuardado.getEstado());

        
        return tipoVentaResponseDTO;
    }
    
    


}
