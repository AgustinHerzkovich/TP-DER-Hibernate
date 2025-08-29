package com.example.hibernate.dominio.postulacion.estadoPostulacion;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "nombre", discriminatorType = DiscriminatorType.STRING)
public abstract class EstadoPostulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer diasEnEstado;

}
