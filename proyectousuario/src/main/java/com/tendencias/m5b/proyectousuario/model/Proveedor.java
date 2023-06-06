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
public class Proveedor {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedor_id")
    private  int proveedor_id;
    @Column(name = "ciudad")
    private String proveedor_ciudad;
    @JsonIgnore
    @OneToMany(mappedBy= "proveedor")
    private List<Usuario> listaUsuarios;
    
    @ManyToOne
    @JoinColumn(name= "prod_id" , referencedColumnName ="id_prod")
    private Producto producto;
    
    @JsonIgnore
    @OneToMany(mappedBy= "compras")
    private List<Compras> listaCompras;
}
