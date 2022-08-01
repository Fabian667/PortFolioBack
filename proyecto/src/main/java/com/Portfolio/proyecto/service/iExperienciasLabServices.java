/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.experienciasLaborales;
import java.util.List;

/**
 *
 * @author cabaa'
 */
public interface iExperienciasLabServices {

    public List<experienciasLaborales> verExperiencias();

    public void crearExpe(experienciasLaborales per);

    public void BorrarExperiencias(Long id);

    public experienciasLaborales buscarExperiencias(Long id);

}
