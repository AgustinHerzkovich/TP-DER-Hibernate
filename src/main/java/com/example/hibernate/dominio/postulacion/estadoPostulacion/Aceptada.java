package com.example.hibernate.dominio.postulacion.estadoPostulacion;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Aceptada")
public class Aceptada extends EstadoPostulacion {
}
