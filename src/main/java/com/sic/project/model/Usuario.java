package com.sic.project.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI
    @Column(name = "id_usuario", nullable = false, unique = true) // PK, NN
    private Long id_usuario;

    @Column(name = "identificacion", unique = true, nullable = false, length = 10) // NN, UQ
    private String identificacion;

    @Column(name = "nombre", nullable = false) // NN
    private String nombre;

    @Column(name = "correo_electronico", nullable = false) // NN
    private String correo_electronico;

    @Column(name = "contrasena", nullable = false) // NN
    private String contrasena;

    @Column(name = "fecha_registro", nullable = false) // NN
    private Date fecha_registro;

    @Column(name = "telefono", nullable = false, length = 10) // NN
    private String telefono;

    @Column(name = "direccion", nullable = false) // NN
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "membresia_id_membresia", referencedColumnName = "id_membresia")
    private Membresia membresia;
}
