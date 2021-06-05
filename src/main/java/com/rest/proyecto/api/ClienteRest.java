/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.proyecto.api;

import com.rest.proyecto.dao.ClienteDAO;
import com.rest.proyecto.model.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fabrizio
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("clientes")
public class ClienteRest {
    
    @Autowired
    private ClienteDAO clienteDAO;
    
    //Metodos HTTP
    // GET, POST, PUT DELETE -> 200 - 500 - 404
    @GetMapping("lista")
    public ResponseEntity<List<Cliente>> listarCliente(){
        List<Cliente> cliente = clienteDAO.findAll();
        return ResponseEntity.ok(cliente);
    }
    @PostMapping("registro")
    public void registrarCliente(@RequestBody Cliente cli){
        clienteDAO.save(cli);
    }
}
