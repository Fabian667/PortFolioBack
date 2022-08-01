/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.model;

import java.util.Date;
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
@Table(name = "EDUCACION")
public class educacion {

    @Id
    private long idEDUCACION;
    private Date COMIENZO;
    private String ESTADO;
    private Date FIN;
    private String INSTITUCION;
    private long PERSONAS_idPERSONA;
    private long TIPO_ESTUDIO;

    public educacion() {
    }

    public educacion(long idEDUCACION, Date COMIENZO, String ESTADO, Date FIN, String INSTITUCION, long PERSONAS_idPERSONA, long TIPO_ESTUDIO) {
        this.idEDUCACION = idEDUCACION;
        this.COMIENZO = COMIENZO;
        this.ESTADO = ESTADO;
        this.FIN = FIN;
        this.INSTITUCION = INSTITUCION;
        this.PERSONAS_idPERSONA = PERSONAS_idPERSONA;
        this.TIPO_ESTUDIO = TIPO_ESTUDIO;
    }

    public long getIdEDUCACION() {
        return idEDUCACION;
    }

    public void setIdEDUCACION(long idEDUCACION) {
        this.idEDUCACION = idEDUCACION;
    }

    public Date getCOMIENZO() {
        return COMIENZO;
    }

    public void setCOMIENZO(Date COMIENZO) {
        this.COMIENZO = COMIENZO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public Date getFIN() {
        return FIN;
    }

    public void setFIN(Date FIN) {
        this.FIN = FIN;
    }

    public String getINSTITUCION() {
        return INSTITUCION;
    }

    public void setINSTITUCION(String INSTITUCION) {
        this.INSTITUCION = INSTITUCION;
    }

    public long getPERSONAS_idPERSONA() {
        return PERSONAS_idPERSONA;
    }

    public void setPERSONAS_idPERSONA(long PERSONAS_idPERSONA) {
        this.PERSONAS_idPERSONA = PERSONAS_idPERSONA;
    }

    public long getTIPO_ESTUDIO() {
        return TIPO_ESTUDIO;
    }

    public void setTIPO_ESTUDIO(long TIPO_ESTUDIO) {
        this.TIPO_ESTUDIO = TIPO_ESTUDIO;
    }

}
