/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vPerez.ProgramacionNCapasNov2025.JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author digis
 */
@Entity
@Table(name="COLONIA")
public class Colonia {

    @Id
    @Column(name="idcolonia")
    private int idColonia;
    private String nombre;
    @Column(name = "codigopostal")
    private String codigoPostal;
    @ManyToOne
    @JoinColumn(name="idmunicipio")
    public Municipio municipio;
}
