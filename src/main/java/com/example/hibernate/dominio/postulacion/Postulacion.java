package com.example.hibernate.dominio.postulacion;
import com.example.hibernate.dominio.busqueda.Busqueda;
import com.example.hibernate.dominio.postulacion.estadoPostulacion.*;
import com.example.hibernate.dominio.postulacion.recursoPostulacion.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity
public class Postulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Postulante postulante;

    private LocalDateTime fechaCreacion;

    @ManyToOne
    private Busqueda busqueda;

    @ManyToOne
    private EstadoPostulacion estadoPostulacion;

    @ManyToMany
    private List<Foto> fotos;

    @ManyToOne
    private Cv cv;

    @ManyToOne
    private Reel reel;
}
