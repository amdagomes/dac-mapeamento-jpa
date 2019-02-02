package com.dac.cenario.dois;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Amand
 */
public class ConcertoDAO {

    private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

    public static void salvarConcerto(Concerto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(concerto);
        transaction.commit();
    }
    
    public static void removerConcerto(Concerto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(concerto);
        transaction.commit();
    }
    
    public static void salvarFuncionario(Funcionario funcionario) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(funcionario);
        transaction.commit();
    }
    
    public static void removerFuncionario(Funcionario funcionario) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(funcionario);
        transaction.commit();
    }
    
    public static void salvarOficina(Oficina oficina) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(oficina);
        transaction.commit();
    }
    
    public static void removerOficina(Oficina oficina) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(oficina);
        transaction.commit();
    }
}
