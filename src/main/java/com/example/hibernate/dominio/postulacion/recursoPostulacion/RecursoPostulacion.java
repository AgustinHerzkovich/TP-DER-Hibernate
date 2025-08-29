package com.example.hibernate.dominio.postulacion.recursoPostulacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
public abstract class RecursoPostulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String descripcion;
    protected String url;
    protected LocalDateTime fechaSubida;

    public RecursoPostulacion() {

    }
}