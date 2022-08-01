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


@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
public class usuarios {

    @Id
    private long idUSUARIOS;
    private String nombre;
    private String correo;
    private long personas_idPersonas;
    private String Pass;

    public usuarios() {
    }

    public usuarios(long idUSUARIOS, String nombre, String Pass, String correo, long personas_idPersonas) {
        this.idUSUARIOS = idUSUARIOS;
        this.nombre = nombre;
        this.correo = correo;
        this.personas_idPersonas = personas_idPersonas;
        this.Pass = Pass;
    }

    public long getIdUSUARIOS() {
        return idUSUARIOS;
    }

    public void setIdUSUARIOS(long idUSUARIOS) {
        this.idUSUARIOS = idUSUARIOS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getPersonas_idPersonas() {
        return personas_idPersonas;
    }

    public void setPersonas_idPersonas(long personas_idPersonas) {
        this.personas_idPersonas = personas_idPersonas;
    }
    

}
