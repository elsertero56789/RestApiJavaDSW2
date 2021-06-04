/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.proyecto.dao;

import com.rest.proyecto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fabrizio
 */
public interface ClienteDAO extends JpaRepository<Cliente, Integer>{
    
}
