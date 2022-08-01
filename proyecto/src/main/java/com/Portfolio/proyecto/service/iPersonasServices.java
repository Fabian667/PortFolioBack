/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.personas;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iPersonasServices {
    
    public List<personas> verPersonas();
    public void crearPersona(personas per);
    public void BorrarPersona(Long id);
    public personas buscarPersonas(Long id);
}
