package com.example.hibernate.dominio.busqueda;

import com.example.hibernate.dominio.postulacion.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class PerfilBusqueda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Genero generoBuscado;

    private Integer EdadInicial;

    private Integer EdadFinal;

    public PerfilBusqueda() {

    }
}
