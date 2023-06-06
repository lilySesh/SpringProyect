/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.repositorio;

import com.tendencias.m5b.proyectousuario.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author lilis
 */
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
     @Query(value = "Select * from persona u where u.nombre = :nombre", nativeQuery = true)
    public Persona buscarPersona(String nombre);
}
