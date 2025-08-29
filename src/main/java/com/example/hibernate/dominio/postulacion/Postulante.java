package com.example.hibernate.dominio.postulacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Postulante {
    @Id
    private String id = UUID.randomUUID().toString();

    private String nombre;

    private String apellido;

    private Integer edad;

    @Enumerated(EnumType.STRING)
    private Genero genero;
}
