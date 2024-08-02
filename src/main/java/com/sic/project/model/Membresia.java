package com.sic.project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI
    @Column(name = "id_membresia", nullable = false, unique = true) // PK, NN
    private Long id_membresia;

    @Column
    private String tipo;

    @Column
    private Double costo;

    @Column
    private Date fecha_caducidad;
}
