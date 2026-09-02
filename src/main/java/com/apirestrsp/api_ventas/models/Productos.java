package com.apirestrsp.api_ventas.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProducto;

    @Column(length=100)
    private String nombreProducto;
    
    private int stock;

    @Column(precision=10,scale=2)
    private BigDecimal precio;

    @Column(length=100)
    private String estado;

    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;
}
