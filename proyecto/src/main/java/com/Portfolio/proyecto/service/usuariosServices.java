/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.usuarios;
import com.Portfolio.proyecto.repository.usuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cabaa
 */
@Service 
public class usuariosServices implements iUsuariosServices{
    @Autowired
    public usuariosRepository usuarios;

    @Override
    public List<usuarios> verUsuarios() {
           return usuarios.findAll();
    }

    @Override
    public void crearUsuarios(usuarios per) {
       usuarios.save(per);
    }

    @Override
    public void BorrarUsuarios(Long id) {
      usuarios.deleteById(id);
    }

    @Override
    public usuarios buscarUsuarios(Long id) {
         return usuarios.findById(id).orElse(null);
    }
    
}
