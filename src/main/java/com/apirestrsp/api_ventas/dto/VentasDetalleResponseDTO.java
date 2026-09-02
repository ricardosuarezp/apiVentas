package com.apirestrsp.api_ventas.dto;

import java.math.BigDecimal;

public class VentasDetalleResponseDTO {
    private int idVentaDetalle;
    private Integer idProductos;
    private int cantidad;
    private BigDecimal precio;
    private BigDecimal subtotal;
    public int getIdVentaDetalle() {
        return idVentaDetalle;
    }
    public void setIdVentaDetalle(int idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }
    public Integer getIdProductos() {
        return idProductos;
    }
    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public BigDecimal getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    
}
