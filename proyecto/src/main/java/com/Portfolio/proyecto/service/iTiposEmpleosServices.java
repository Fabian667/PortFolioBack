/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.tiposEmpleos;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iTiposEmpleosServices {

    public List<tiposEmpleos> verTiposEmpleos();

    public void crearTiposEmpleos(tiposEmpleos per);

    public void BorrarTiposEmpleos(Long id);

    public tiposEmpleos buscarTecnologias(Long id);

}
