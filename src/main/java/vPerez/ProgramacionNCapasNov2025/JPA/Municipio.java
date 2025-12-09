/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vPerez.ProgramacionNCapasNov2025.JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
//import jakarta.persistence.OneToOne;

/**
 *
 * @author digis
 */
@Entity
@Table(name="MUNICIPIO")
public class Municipio {
    @Column(name="idmunicipio")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idMunicipio;
    private String nombre;
    @ManyToOne
    @JoinColumn(name="idestado")
    public Estado estado;
}
