/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.repositorio;

import com.tendencias.m5b.proyectousuario.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author lilis
 */
public interface RolRepository extends JpaRepository<Rol, Integer>  {
      @Query(value = "Select * from rol u where u.nombre_rol = :nombre_rol", nativeQuery = true)
    public Rol buscarRol(String nombre);
}
