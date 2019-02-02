/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.cenario.tres;

import java.io.Serializable;
import java.util.Date;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Cliente
 */
@Entity
@IdClass(MaterialDidaticoPK.class)

public class MaterialDidatico implements Serializable {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private long codigo;
    @Id
    @Column(length = 45, nullable = false)
    private String origem;
    @Column(length = 155, nullable = false)
    private String titulo;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String descricao;
    @Column(length = 55)
    private String autor;
    @Column(name = "tamanho", columnDefinition = "Decimal(6,2)")
    private double tamanho;
    private boolean publico;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @Enumerated(EnumType.STRING)

    private TipoMaterialDidatico tipo;

    public MaterialDidatico() {
    }

    public MaterialDidatico(String origem, String titulo, String descricao,
            String autor, double tamanho, boolean publico, TipoMaterialDidatico tipo) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.tamanho = tamanho;
        this.publico = publico;
        this.dataCadastro = new Date();
        this.tipo = tipo;
        this.origem = origem;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoMaterialDidatico getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterialDidatico tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 29 * hash + Objects.hashCode(this.origem);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.autor);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.tamanho) ^ (Double.doubleToLongBits(this.tamanho) >>> 32));
        hash = 29 * hash + (this.publico ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.dataCadastro);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialDidatico other = (MaterialDidatico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.tamanho) != Double.doubleToLongBits(other.tamanho)) {
            return false;
        }
        if (this.publico != other.publico) {
            return false;
        }
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

}
