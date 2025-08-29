package com.example.hibernate.dominio.postulacion.estadoPostulacion;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NoAprobada")
public class NoAprobada extends EstadoPostulacion {
}
