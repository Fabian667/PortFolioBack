/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.educacion;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iEducacionServices {

    public List<educacion> verEducacion();

    public void crearEducacion(educacion per);

    public void BorrarEducacion(Long id);

    public educacion buscarEducacion(Long id);

}
