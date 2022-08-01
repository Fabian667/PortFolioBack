/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.service;
import com.Portfolio.proyecto.model.personas;
import com.Portfolio.proyecto.repository.personasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cabaa
 */
@Service
public class personasServices implements iPersonasServices{
@Autowired
public personasRepository persoRepo;
        
    @Override
    public List<personas> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(personas per) {
        persoRepo.save(per);
    }

    @Override
    public void BorrarPersona(Long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public personas buscarPersonas(Long id) {
       return persoRepo.findById(id).orElse(null);
    }


    
}
