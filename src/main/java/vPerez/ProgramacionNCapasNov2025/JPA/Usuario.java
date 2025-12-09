/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vPerez.ProgramacionNCapasNov2025.JPA;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author digis
 */
@Entity
@Table(name="USUARIO")
public class Usuario {
    @Column(name="idusuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idUsuario;
    private String nombre;
    @Column(name="apellidopaterno")
    private String apellidoPaterno;
    @Column(name = "apellidomaterno")
    private String apellidoMaterno;
    private String email;
    private String password;
    @Column(name="fechanacimiento")
    private Date fechaNacimiento;
    @JoinColumn(name = "idrol")
    @ManyToOne
    public Rol rol;
    private String sexo;
    private String telefono;
    private String celular;
    private String curp;
    @OneToMany(mappedBy = "usuario",  cascade = CascadeType.ALL,  orphanRemoval = true)
    public List<Direccion> direcciones = new ArrayList<>();//Relacion del lado de 1, un usuario tiene muchas direcciones, esta vez inicializado
}
