/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.usuarios;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iUsuariosServices {

    public List<usuarios> verUsuarios();

    public void crearUsuarios(usuarios per);

    public void BorrarUsuarios(Long id);

    public usuarios buscarUsuarios(Long id);

}
