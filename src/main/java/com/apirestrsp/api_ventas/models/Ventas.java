package com.apirestrsp.api_ventas.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idVenta;

    @ManyToOne
    @JoinColumn(name="idTipoVenta")
    private TipoVenta idTipoVenta;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name="idClientes")
    private Clientes idClientes;

    private LocalDate fechaVenta;
    
    @Column(length=100)
    private String estado;

    @Column(length=100)
    private String metodoPago;

    @Column(precision=10,scale=2)
    private BigDecimal total;

    private LocalDateTime fechaCreacion;

    @Column(length=100)
    private String usuarioCreacion;

    private LocalDateTime fechaModifico;

    @Column(length=100)
    private String usuarioModifico;

    @OneToMany(mappedBy = "idVentas",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<VentasDetalle> ventasDetalles = new ArrayList<>();
}
