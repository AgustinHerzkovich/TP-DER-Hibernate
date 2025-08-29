package com.example.hibernate.dominio.postulacion.recursoPostulacion;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Cv extends RecursoPostulacion {

    public Cv(String descripcion, String url) {
        this.url = url;
        this.descripcion = descripcion;
        this.fechaSubida = LocalDateTime.now();
    }
}
