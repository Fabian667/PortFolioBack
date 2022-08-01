/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.tiposEmpleos;
import com.Portfolio.proyecto.repository.tiposEmpleosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cabaa
 */
@Service
public class tiposEmpleosServices implements iTiposEmpleosServices {

    @Autowired
    public tiposEmpleosRepository emple;

    @Override
    public List<tiposEmpleos> verTiposEmpleos() {
        return emple.findAll();
    }

    @Override
    public void crearTiposEmpleos(tiposEmpleos per) {
        emple.save(per);
    }

    @Override
    public void BorrarTiposEmpleos(Long id) {
        emple.deleteById(id);
    }

    @Override
    public tiposEmpleos buscarTecnologias(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
