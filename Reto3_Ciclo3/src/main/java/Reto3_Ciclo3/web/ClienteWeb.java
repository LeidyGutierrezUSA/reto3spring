/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo3.web;

import Reto3_Ciclo3.modelo.Cliente;
import Reto3_Ciclo3.sevicio.serviciosCliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author solecito
 */
@RestController
@RequestMapping("/api/Client")
public class ClienteWeb {

    @Autowired
    private serviciosCliente servicios;
    @GetMapping("/all")
    public List <Cliente> getClient(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> getClient(@PathVariable("id") int idClient) {
        return servicios.getClient(idClient);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente) {
        return servicios.save(cliente);
    }
     
}
