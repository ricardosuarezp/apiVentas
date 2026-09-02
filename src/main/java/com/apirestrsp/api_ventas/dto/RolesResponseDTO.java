package com.apirestrsp.api_ventas.dto;

public class RolesResponseDTO {
    private Integer idRol;
    private String descripcionRol;
    private String estado;
    
    public Integer getIdRol() {
        return idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public String getDescripcionRol() {
        return descripcionRol;
    }
    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
