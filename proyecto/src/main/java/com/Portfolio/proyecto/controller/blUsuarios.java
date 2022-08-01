/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.proyecto.controller;

import com.Portfolio.proyecto.model.usuarios;
import com.Portfolio.proyecto.service.iUsuariosServices;
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
public class blUsuarios {

    @Autowired
    private iUsuariosServices persoServ;

    @PostMapping("/new/Usuarios")
    public void agregarUsuario(@RequestBody usuarios pers) {
        persoServ.crearUsuarios(pers);
    }

    @GetMapping("/ver/Usuarios")
    @ResponseBody
    public List<usuarios> verPersonas() {
        return persoServ.verUsuarios();
    }

    @DeleteMapping("/delete/{idUsuarios}")
    public void borrarPersona(@PathVariable long id) {
        persoServ.BorrarUsuarios(id);
    }

}
