package com.apirestrsp.api_ventas.dto;

public class TipoVentaResponseDTO {
    private int idTipoVenta;
    private String descripcionTipoVenta;
    private String estado;
    
    public int getIdTipoVenta() {
        return idTipoVenta;
    }
    public void setIdTipoVenta(int idTipoVenta) {
        this.idTipoVenta = idTipoVenta;
    }
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
