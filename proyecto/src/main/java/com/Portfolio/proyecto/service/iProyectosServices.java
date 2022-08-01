/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.proyectos;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iProyectosServices {

    public List<proyectos> verProyectos();

    public void crearProyectos(proyectos per);

    public void BorrarProyectos(Long id);

    public proyectos buscarProyectos(Long id);

}
