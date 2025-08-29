package com.example.hibernate;

import com.example.hibernate.dominio.busqueda.*;
import com.example.hibernate.dominio.postulacion.Genero;
import com.example.hibernate.dominio.postulacion.Postulacion;
import com.example.hibernate.dominio.postulacion.Postulante;
import com.example.hibernate.dominio.postulacion.recursoPostulacion.Cv;
import com.example.hibernate.utils.BDUtils;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;

public class DemoFinal {

    public static void main(String[] args) {

        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);

        // Crear postulacion
        Postulacion postulacion = new Postulacion();
        Cv cv = new Cv("Mi CV", "http://mi-cv.com");
        postulacion.setCv(cv);

        // Crear localización
        Localizacion localizacion = new Localizacion();
        localizacion.setPais("Argentina");
        localizacion.setProvincia("Buenos Aires");
        localizacion.setCiudad("La Plata");
        localizacion.setDireccion("Calle 123");

        // Crear perfil de búsqueda
        PerfilBusqueda perfilBusqueda = new PerfilBusqueda();
        perfilBusqueda.setEdadInicial(25);
        perfilBusqueda.setEdadFinal(50);
        perfilBusqueda.setGeneroBuscado(Genero.MASCULINO);

        // Crear búsqueda
        Busqueda busqueda = new Busqueda();
        busqueda.setFechaPublicacion(LocalDateTime.now());
        busqueda.setFechaVencimiento(LocalDateTime.now().plusDays(4));
        busqueda.setPerfilBuscado(perfilBusqueda);
        busqueda.setGeneroObra("Drama");
        busqueda.setRequisitosPostulacion(new ArrayList<>());
        busqueda.setTipoRemuneracion(TipoRemuneracion.AD_HONOREM);
        busqueda.setLocalizacion(localizacion);
        busqueda.setInformacionAdicional("Información adicional de la búsqueda");
        busqueda.setEstado(EstadoBusqueda.ACTIVA);
        busqueda.setPostulaciones(Arrays.asList(postulacion));

        // Vincular postulacion con busqueda
        postulacion.setBusqueda(busqueda);

        // Crear postulante
        Postulante postulante = new Postulante();
        postulante.setNombre("Julian");
        postulante.setApellido("Martinez");
        postulante.setEdad(24);
        postulante.setGenero(Genero.MASCULINO);

        // Vincular postulante con postulacion
        postulacion.setPostulante(postulante);

        // Persistir entidades
        em.persist(cv);
        em.persist(perfilBusqueda);
        em.persist(localizacion);
        em.persist(busqueda);
        em.persist(postulacion);
        em.persist(postulante);

        BDUtils.commit(em);

        // Consulta de prueba
        System.out.println("Postulaciones existentes:");
        em.createQuery("SELECT p FROM Postulacion p", Postulacion.class)
                .getResultList()
                .forEach(p -> System.out.println(p.getId() + " - " + p.getPostulante().getNombre()));
    }

}