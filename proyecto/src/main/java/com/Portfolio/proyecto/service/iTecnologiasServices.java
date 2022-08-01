/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.tecnologias;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iTecnologiasServices {

    public List<tecnologias> verProyectos();

    public void crearTecnologias(tecnologias per);

    public void BorrarTecnologias(Long id);

    public tecnologias buscarTecnologias(Long id);

}
