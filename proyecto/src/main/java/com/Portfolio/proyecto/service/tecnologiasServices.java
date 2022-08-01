/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.tecnologias;
import com.Portfolio.proyecto.repository.tecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cabaa
 */
@Service 
public class tecnologiasServices implements iTecnologiasServices{
    @Autowired
    public tecnologiasRepository tecno;

    @Override
    public List<tecnologias> verProyectos() {
         return tecno.findAll();
    }

    @Override
    public void crearTecnologias(tecnologias per) {
         tecno.save(per);
    }

    @Override
    public void BorrarTecnologias(Long id) {
         tecno.deleteById(id);
    }

    @Override
    public tecnologias buscarTecnologias(Long id) {
        return tecno.findById(id).orElse(null);
    }
    
}
