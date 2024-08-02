package com.sic.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class TipoServicio {

    @Id
    @Column
    private Long id_tipo_servicio;

    @Column
    private String servicio;

    @Column
    private String descripcion;



}
