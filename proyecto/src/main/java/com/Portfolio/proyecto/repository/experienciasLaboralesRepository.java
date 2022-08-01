/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.proyecto.repository;

import com.Portfolio.proyecto.model.experienciasLaborales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cabaa
 * @Repository
 */
@Repository
public interface experienciasLaboralesRepository extends JpaRepository<experienciasLaborales, Long> {
    
}
