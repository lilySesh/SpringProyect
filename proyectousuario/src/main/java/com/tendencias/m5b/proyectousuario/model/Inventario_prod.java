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
public class Inventario_prod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventario_id")
    private String inventario_id;
    @Column(name = "cantidad_prod")
    private int cantidad_prod;
    @Column(name = "stock")
    private int stock;
//    @ManyToOne
//    @JoinColumn(name= "prod_id" , referencedColumnName ="id_prod")
//    private Producto producto;
    @JsonIgnore
    @OneToMany(mappedBy= "inventario")
    private List<Producto> listaProductos;
}
