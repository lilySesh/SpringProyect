/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.controller;


import com.tendencias.m5b.proyectousuario.model.Rol;
import com.tendencias.m5b.proyectousuario.service.RolServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lilis
 */
@RestController
@RequestMapping("/rol")
public class RolController {
     @Autowired
    RolServiceImpl rolService;
     @Operation(summary = "Se obtiene la lista de Personas")
    @GetMapping("/listar")
    public ResponseEntity<List<Rol>> listaroles() {
        return new ResponseEntity<>(rolService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos del Personas")
    @PostMapping("/crear")
    public ResponseEntity<Rol> crearRol(@RequestBody Rol r) {
        return new ResponseEntity<>(rolService.save(r), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Rol> actualizarPersona(@PathVariable Integer id, @RequestBody Rol r) {
        Rol rol = rolService.findById(id);
        if (rol != null) {
            try {
                rol.setNombre_rol(r.getNombre_rol());
                rol.setDescripcion(r.getDescripcion());
                rol.setEstado(r.getEstado());
                return new ResponseEntity<>(rolService.save(rol), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Rol> elimiarRol(@PathVariable Integer id) {
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
