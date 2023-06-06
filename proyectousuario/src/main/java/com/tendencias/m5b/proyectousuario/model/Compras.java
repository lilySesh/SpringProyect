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
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compras")
    private int id_compras;
    @Column(name = "pvp")
    private double pvp;
    
    @ManyToOne
    @JoinColumn(name= "id_proveedor" , referencedColumnName ="proveedor_id")
    private Proveedor proveedor;
    @ManyToOne
    @JoinColumn(name= "producto_id" , referencedColumnName ="id_prod")
    private Producto producto;
    @JsonIgnore
    @OneToMany(mappedBy= "compras")
    private List<Compras> listaCompras;
    //RELACION UNO A UNO
    //     @OneToOne(mappedBy="socio")
//  
//     private Tarjeta tarjeta;
    
  //@OneToOne
  //@JoinColumn(name="socios_dni")
  //private Socio socio;
}
