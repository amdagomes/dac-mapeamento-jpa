/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.cenario.um;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Cliente
 */

@Entity
public class Funcionario {
    @Id
    private int id;
    private String nome;
    private String cpf;
    private float salario;
     private List<Projeto> projetos;

    public Funcionario(String nome, String cpf, float salario, List<Projeto> projetos) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
     
     
     
     
     
}
