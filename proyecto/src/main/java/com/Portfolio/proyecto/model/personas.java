/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PERSONAS")
public class personas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPERSONA;
    private String ACERCA_DE;
    private String APELLIDO;
    private String CORREO;
    private String DOMICILIO;
    private String F_NACIMIENTO;
    private String NOMBRE;
    private String TELEFONO;

    public personas() {
    }
    

    public personas(Long idPERSONA, String ACERCA_DE, String APELLIDO, String CORREO, String DOMICILIO, String F_NACIMIENTO, String NOMBRE, String TELEFONO) {
        this.idPERSONA = idPERSONA;
        this.ACERCA_DE = ACERCA_DE;
        this.APELLIDO = APELLIDO;
        this.CORREO = CORREO;
        this.DOMICILIO = DOMICILIO;
        this.F_NACIMIENTO = F_NACIMIENTO;
        this.NOMBRE = NOMBRE;
        this.TELEFONO = TELEFONO;
    }

}
