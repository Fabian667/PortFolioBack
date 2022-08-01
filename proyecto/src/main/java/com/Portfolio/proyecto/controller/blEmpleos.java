/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.controller;

import com.Portfolio.proyecto.model.personas;
import com.Portfolio.proyecto.service.iPersonasServices;
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
public class blEmpleos {

    @Autowired
    private iPersonasServices persoServ;

    @PostMapping("/new/empleos")
    public void agregarPersona(@RequestBody personas pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping("/ver/empleos")
    @ResponseBody
    public List<personas> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{idEmpleo}")
    public void borrarPersona(@PathVariable long id) {
        persoServ.BorrarPersona(id);
    }

}
