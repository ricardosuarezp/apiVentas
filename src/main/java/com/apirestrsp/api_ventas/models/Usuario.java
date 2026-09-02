package com.apirestrsp.api_ventas.models;

import java.time.LocalDateTime;

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
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idUsuario;

    @Column(length=100)
    private String nombreUsuario;

    @ManyToOne
    @JoinColumn(name="idRol")
    private Roles idRol;

    @Column(length=255)
    private String password;

    @Column(length=100)
    private String estado;

    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;
}
