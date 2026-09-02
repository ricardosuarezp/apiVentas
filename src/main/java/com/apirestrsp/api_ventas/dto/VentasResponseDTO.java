package com.apirestrsp.api_ventas.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VentasResponseDTO {
    private int idVenta;
    private Integer idTipoVenta;
    private Integer idUsuario;
    private Integer idClientes;
    private LocalDate fechaVenta;
    private String estado;
    private String metodoPago;
    private BigDecimal total;
    private List<VentasDetalleResponseDTO> ventasDetalles;
    public int getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
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
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
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
    public List<VentasDetalleResponseDTO> getVentasDetalles() {
        return ventasDetalles;
    }
    public void setVentasDetalles(List<VentasDetalleResponseDTO> ventasDetalles) {
        this.ventasDetalles = ventasDetalles;
    }

    
}
