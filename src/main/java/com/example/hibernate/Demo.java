package com.example.hibernate;

import com.example.hibernate.dominio.busqueda.Busqueda;
import com.example.hibernate.utils.BDUtils;
import javax.persistence.EntityManager;

public class Demo {

    public static void main(String[] args) {
        
        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);
        
        
        BDUtils.commit(em);
    }
}
