package com.apirestrsp.api_ventas.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="VentasDetalle")
public class VentasDetalle {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idVentaDetalle;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="idVentas")
    private Ventas idVentas;

    @ManyToOne
    @JoinColumn(name="idProductos")
    private Productos idProductos;

    private int cantidad;
    
    @Column(precision=10,scale=2)
    private BigDecimal precio;

    @Column(precision=10,scale=2)
    private BigDecimal subtotal;
    
    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;
    
}
