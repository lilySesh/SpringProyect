/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.service;

import com.tendencias.m5b.proyectousuario.model.Persona;
import com.tendencias.m5b.proyectousuario.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author lilis
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Integer> implements GenericService<Persona, Integer> {
     @Autowired
     PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Integer> getDao() {
         return personaRepository;
    }
    
}
