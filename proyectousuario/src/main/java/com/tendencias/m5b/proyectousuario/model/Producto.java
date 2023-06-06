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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

/**
 *
 * @author lilis
 */
@Data
@Entity
public class Producto {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prod")
    private String id_prod;
     @Column(name = "nombre")
    private String nombre;
     @Column(name = "precio_emprendedor")
    private double precio_emprendedor;
     @Column(name = "categoria")
    private String categoria;
     @Column(name = "imagen")
    private String imagen;
     @Column(name = "color")
    private String color;
     @Column(name = "talla")
    private String talla;
    
    @JsonIgnore
    @OneToMany(mappedBy= "producto")
    private List<Proveedor> listaProveedores;
    
    
//    @JsonIgnore
//    @OneToMany(mappedBy= "producto")
//    private List<Usuario> listaInventarios;
    @ManyToOne
    @JoinColumn(name= "inventario_id" , referencedColumnName ="inventario_id")
    private Inventario_prod inventario;
}
