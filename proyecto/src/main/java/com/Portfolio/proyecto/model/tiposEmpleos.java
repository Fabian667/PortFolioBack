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
@Table(name = "tiposEmpleos")
public class tiposEmpleos {
    @Id
    private long idEmpleos;
    private String nombre;
    private String Descripcion;

    public tiposEmpleos() {
    }

    public tiposEmpleos(long idEmpleos, String nombre, String Descripcion) {
        this.idEmpleos = idEmpleos;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
    }

    public long getIdEmpleos() {
        return idEmpleos;
    }

    public void setIdEmpleos(long idEmpleos) {
        this.idEmpleos = idEmpleos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
