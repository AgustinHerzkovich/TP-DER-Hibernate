package com.example.hibernate.dominio.postulacion.recursoPostulacion;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Reel extends RecursoPostulacion {
    public Reel(String descripcion, String url) {
        this.url = url;
        this.descripcion = descripcion;
        this.fechaSubida = LocalDateTime.now();
    }
}
