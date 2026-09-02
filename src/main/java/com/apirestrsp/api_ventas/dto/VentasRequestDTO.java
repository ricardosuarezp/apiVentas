package com.apirestrsp.api_ventas.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VentasRequestDTO {
    private Integer idTipoVenta;
    private Integer idUsuario;
    private Integer idClientes;
    private LocalDate fechaVenta;
    private String metodoPago;
    private BigDecimal total;
    private List<VentasDetalleRequestDTO> ventasDetalles;
    
    public Integer getIdTipoVenta() {
        return idTipoVenta;
    }
    public void setIdTipoVenta(Integer idTipoVenta) {
        this.idTipoVenta = idTipoVenta;
    }
    public Integer getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Integer getIdClientes() {
        return idClientes;
    }
    public void setIdClientes(Integer idClientes) {
        this.idClientes = idClientes;
    }
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public List<VentasDetalleRequestDTO> getVentasDetalles() {
        return ventasDetalles;
    }
    public void setVentasDetalles(List<VentasDetalleRequestDTO> ventasDetalles) {
        this.ventasDetalles = ventasDetalles;
    }
    
    
}
