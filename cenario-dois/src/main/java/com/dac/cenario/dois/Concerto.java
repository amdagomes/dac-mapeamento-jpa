package com.dac.cenario.dois;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Amand
 */
@Entity
public class Concerto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double valor;
    @Temporal(TemporalType.DATE)
    private Date dataConcerto;
    
    @OneToOne
    private Funcionario funcionario;
    @ManyToOne
    private Oficina oficina;
    
    public Concerto(double valor, Funcionario funcionario, Oficina oficina) {
        this();
        this.valor = valor;
        this.funcionario = funcionario;
        this.oficina = oficina;
    }

    public Concerto() {
        this.dataConcerto = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataConcerto() {
        return dataConcerto;
    }

    public void setDataConcerto(Date dataConcerto) {
        this.dataConcerto = dataConcerto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
            
}
