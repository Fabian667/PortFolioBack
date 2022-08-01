/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.service;

import com.Portfolio.proyecto.model.menus;
import java.util.List;

/**
 *
 * @author cabaa
 */
public interface iMenusServices {

    public List<menus> verMenus();

    public void crearMenus(menus per);

    public void BorrarMenus(Long id);

    public menus buscarMenus(Long id);

}
