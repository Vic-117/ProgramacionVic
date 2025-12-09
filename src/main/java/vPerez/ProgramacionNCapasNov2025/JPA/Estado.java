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

/**
 *
 * @author digis
 */
@Entity
@Table(name="ESTADO")
public class Estado {
    @Id
    @Column(name="idestado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;
    private String nombre;
    @JoinColumn(name="idpais")
    @ManyToOne
    public Pais pais;
}
