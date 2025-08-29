package com.example.hibernate.dominio.busqueda;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class BusquedaAgenciaPublicidad extends Busqueda {
    private String productoOServicio;
}