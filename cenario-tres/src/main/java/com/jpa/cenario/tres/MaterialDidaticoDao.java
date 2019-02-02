/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.cenario.tres;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Cliente
 */
public class MaterialDidaticoDao {

    private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

    public static void salvar(MaterialDidatico mat) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(mat);
        transaction.commit();
    }

    public void excluir(MaterialDidatico mt) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(mt);
        transaction.commit();
    }

    public void Atualizar(MaterialDidatico mt) {
        
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.merge(mt);
            transaction.commit();
        }

    }


