/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.repository;

import com.Portfolio.proyecto.model.tiposEmpleos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cabaa
 */
@Repository
public interface tiposEmpleosRepository extends JpaRepository<tiposEmpleos, Long>  {
    
}
