package com.example.hibernate.dominio.busqueda;

import com.example.hibernate.dominio.postulacion.Postulacion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Busqueda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaPublicacion;

    private LocalDateTime fechaVencimiento;

    @ManyToOne
    private PerfilBusqueda perfilBuscado;

    private String generoObra;

    @OneToMany
    private List<RequisitoPostulante> requisitosPostulacion;

    @Enumerated(EnumType.STRING)
    private TipoRemuneracion tipoRemuneracion;

    @ManyToOne
    private Localizacion localizacion;

    private String InformacionAdicional;

    @Enumerated(EnumType.STRING)
    private EstadoBusqueda estado;

    @OneToMany(mappedBy = "busqueda")
    private List<Postulacion> postulaciones;

}
