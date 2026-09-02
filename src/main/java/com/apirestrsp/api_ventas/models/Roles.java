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
@Table(name="Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idRol;

    @Column(length=100)
    private String descripcionRol;

    @Column(length=100)
    private String estado;

    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;
}
