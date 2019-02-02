package com.jpa.cenario.um;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Amand
 */
@Entity
@IdClass(TrabalhaProjetoPK.class)
public class TrabalhaProjeto implements Serializable{
    
    @Id
    @Column(insertable = false, updatable = false)
    private int funcionario_id;
    @Id
    @Column(insertable = false, updatable = false)
    private int projeto_id;
    private int horas;
    private LocalDate dataIngresso;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    @ManyToOne 
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

    public TrabalhaProjeto(int horas, LocalDate dataIngresso, Projeto projeto, Funcionario funcionario) {
        this();
        this.horas = horas;
        this.dataIngresso = dataIngresso;
        this.projeto = projeto;
        this.funcionario = funcionario;
    }
        
    public TrabalhaProjeto() {
    }
    
    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public int getProjeto_id() {
        return projeto_id;
    }

    public void setProjeto_id(int projeto_id) {
        this.projeto_id = projeto_id;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }  
   
}
