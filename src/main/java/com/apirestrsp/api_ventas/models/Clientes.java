package com.apirestrsp.api_ventas.models;

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
@Table(name="Clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCliente;

    @Column(length=100)
    private String nombres;

    @Column(length=200)
    private String correo;

    @Column(length=20)
    private String telefono;

    @Column(length=250)
    private String direccion;

    @Column(length=100)
    private String estado = "Activo";

    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;
}
