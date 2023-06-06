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
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ventas_id")
    private int ventas_id;
     @Column(name = "cliente_id")
    private int cliente_id;
      @Column(name = "precio_total")
    private double precio_total;
       @Column(name = "fecha_venta")
    private String fecha_venta;
    
    @ManyToOne
    @JoinColumn(name= "id_persona" , referencedColumnName ="id")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name= "id_producto" , referencedColumnName ="prod_id")
    private Producto Producto;
    
    @JsonIgnore
    @OneToMany(mappedBy= "ventas")
    private List<Ingresos> listaIngresos;
    
}
