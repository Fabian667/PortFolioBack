/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "EXPERIENCIAS_LABORALES")
public class experienciasLaborales {
    @Id
    private long idEXOPERIENCIA_LABORAL;
    private String DESCRIPCION;
    private Date FECHA_FIN;
    private Date FECHA_INICIO;
    private String NOMBRE_EMPRESA;
    private long PERSONAS_idPERSONA;
    private int TIPO_EMPLEO;
    private Boolean TRABAJO_ACTUAL;

    public experienciasLaborales() {
    }

    public experienciasLaborales(long idEXOPERIENCIA_LABORAL, String DESCRIPCION, Date FECHA_FIN, Date FECHA_INICIO, String NOMBRE_EMPRESA, long PERSONAS_idPERSONA, int TIPO_EMPLEO, Boolean TRABAJO_ACTUAL) {
        this.idEXOPERIENCIA_LABORAL = idEXOPERIENCIA_LABORAL;
        this.DESCRIPCION = DESCRIPCION;
        this.FECHA_FIN = FECHA_FIN;
        this.FECHA_INICIO = FECHA_INICIO;
        this.NOMBRE_EMPRESA = NOMBRE_EMPRESA;
        this.PERSONAS_idPERSONA = PERSONAS_idPERSONA;
        this.TIPO_EMPLEO = TIPO_EMPLEO;
        this.TRABAJO_ACTUAL = TRABAJO_ACTUAL;
    }

    /**
     * @return the idEXOPERIENCIA_LABORAL
     */
    public long getIdEXOPERIENCIA_LABORAL() {
        return idEXOPERIENCIA_LABORAL;
    }

    /**
     * @param idEXOPERIENCIA_LABORAL the idEXOPERIENCIA_LABORAL to set
     */
    public void setIdEXOPERIENCIA_LABORAL(long idEXOPERIENCIA_LABORAL) {
        this.idEXOPERIENCIA_LABORAL = idEXOPERIENCIA_LABORAL;
    }

    /**
     * @return the DESCRIPCION
     */
    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    /**
     * @param DESCRIPCION the DESCRIPCION to set
     */
    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    /**
     * @return the FECHA_FIN
     */
    public Date getFECHA_FIN() {
        return FECHA_FIN;
    }

    /**
     * @param FECHA_FIN the FECHA_FIN to set
     */
    public void setFECHA_FIN(Date FECHA_FIN) {
        this.FECHA_FIN = FECHA_FIN;
    }

    /**
     * @return the FECHA_INICIO
     */
    public Date getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    /**
     * @param FECHA_INICIO the FECHA_INICIO to set
     */
    public void setFECHA_INICIO(Date FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    /**
     * @return the NOMBRE_EMPRESA
     */
    public String getNOMBRE_EMPRESA() {
        return NOMBRE_EMPRESA;
    }

    /**
     * @param NOMBRE_EMPRESA the NOMBRE_EMPRESA to set
     */
    public void setNOMBRE_EMPRESA(String NOMBRE_EMPRESA) {
        this.NOMBRE_EMPRESA = NOMBRE_EMPRESA;
    }

    /**
     * @return the PERSONAS_idPERSONA
     */
    public long getPERSONAS_idPERSONA() {
        return PERSONAS_idPERSONA;
    }

    /**
     * @param PERSONAS_idPERSONA the PERSONAS_idPERSONA to set
     */
    public void setPERSONAS_idPERSONA(long PERSONAS_idPERSONA) {
        this.PERSONAS_idPERSONA = PERSONAS_idPERSONA;
    }

    /**
     * @return the TIPO_EMPLEO
     */
    public int getTIPO_EMPLEO() {
        return TIPO_EMPLEO;
    }

    /**
     * @param TIPO_EMPLEO the TIPO_EMPLEO to set
     */
    public void setTIPO_EMPLEO(int TIPO_EMPLEO) {
        this.TIPO_EMPLEO = TIPO_EMPLEO;
    }

    /**
     * @return the TRABAJO_ACTUAL
     */
    public Boolean getTRABAJO_ACTUAL() {
        return TRABAJO_ACTUAL;
    }

    /**
     * @param TRABAJO_ACTUAL the TRABAJO_ACTUAL to set
     */
    public void setTRABAJO_ACTUAL(Boolean TRABAJO_ACTUAL) {
        this.TRABAJO_ACTUAL = TRABAJO_ACTUAL;
    }
    

}
