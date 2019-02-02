package com.jpa.cenario.main;

import com.jpa.cenario.um.Funcionario;
import com.jpa.cenario.um.Projeto;
import com.jpa.cenario.um.TrabalhaProjeto;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Amand
 */
public class Main {

    public static void main(String[] args) {
        
        Funcionario jhon = new Funcionario("Jhon", "111.111.111-11", 2000);
        Funcionario dan = new Funcionario("Dan", "222.111.111-11", 2000);
        
        Projeto projeto = new Projeto("area", LocalDate.now(), LocalDate.now());
        
        TrabalhaProjeto tp = new TrabalhaProjeto(4, LocalDate.now(), projeto, jhon);
        TrabalhaProjeto tpp = new TrabalhaProjeto(4, LocalDate.now(), projeto, dan);
        
        
        EntityManager em = Persistence.createEntityManagerFactory("DAC").createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(jhon);
        em.persist(dan);
        em.persist(projeto);
        em.persist(tp);
        em.persist(tpp);
        transaction.commit();
    }
}
