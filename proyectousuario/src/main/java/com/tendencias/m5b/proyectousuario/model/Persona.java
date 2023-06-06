/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author lilis
 */
@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String  apellido;
    @Column(name = "correo")
    private String  correo;
    @Column(name = "cedula")
    private String  cedula;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "celular")
    private String celular;
     @Column(name = "contra_persona")
    private String contra_persona;
    
    @JsonIgnore
    @OneToMany(mappedBy= "persona")
    private List<Usuario> listaUsuarios;
    
    
    
    
                   
}
