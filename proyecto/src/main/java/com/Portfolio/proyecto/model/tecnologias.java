/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cabaa
 */
@Getter
@Setter
@Entity
@Table(name = "TECNOLOGIAS")
public class tecnologias {
    @Id
    private long idTenologias;
    private String nombre;
    private String descripcion;
    private Double porcentaje;

    public tecnologias() {
    }

    public tecnologias(long idTenologias, String nombre, String descripcion, Double porcentaje) {
        this.idTenologias = idTenologias;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }

    public long getIdTenologias() {
        return idTenologias;
    }

    public void setIdTenologias(long idTenologias) {
        this.idTenologias = idTenologias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
