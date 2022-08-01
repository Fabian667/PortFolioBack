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
@Table(name = "PROYECTOS")
public class proyectos {
  @Id  private long idPROYECTOS;
    private String nombrePro;
    private String descripcionPro;
    long personasIdPersonas;

    public proyectos() {
    }

    public proyectos(long idPROYECTOS, String nombrePro, String descripcionPro, long personasIdPersonas) {
        this.idPROYECTOS = idPROYECTOS;
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.personasIdPersonas = personasIdPersonas;
    }

    public long getIdPROYECTOS() {
        return idPROYECTOS;
    }

    public void setIdPROYECTOS(long idPROYECTOS) {
        this.idPROYECTOS = idPROYECTOS;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public long getPersonasIdPersonas() {
        return personasIdPersonas;
    }

    public void setPersonasIdPersonas(long personasIdPersonas) {
        this.personasIdPersonas = personasIdPersonas;
    }

}
