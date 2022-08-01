/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.controller;

import com.Portfolio.proyecto.model.personas;
import com.Portfolio.proyecto.service.iPersonasServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cabaa
 */
@RestController
public class blPersonas {

    @Autowired
    private iPersonasServices persoServ;

    @PostMapping("/personas/crear")
    public String agregarPersona(@RequestBody personas pers) {
        persoServ.crearPersona(pers);
        return "la persona se creo correctamente";
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<personas> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{idPersona}")
    public void borrarPersona(@PathVariable long id) {
        persoServ.BorrarPersona(id);
    }
}
