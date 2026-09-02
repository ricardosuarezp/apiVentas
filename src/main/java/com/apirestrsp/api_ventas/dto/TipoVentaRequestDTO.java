package com.apirestrsp.api_ventas.dto;

public class TipoVentaRequestDTO {
    private String descripcionTipoVenta;
    private String estado;
    
    public String getDescripcionTipoVenta() {
        return descripcionTipoVenta;
    }
    public void setDescripcionTipoVenta(String descripcionTipoVenta) {
        this.descripcionTipoVenta = descripcionTipoVenta;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
