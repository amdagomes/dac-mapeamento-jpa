/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.cenario.tres;


import com.jpa.cenario.tres.LocalDateEmDate;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author Cliente
 */
@Entity
public class MaterialDidatico implements Serializable {

   @EmbeddedId
    private  MaterialDidaticoPK chave;
   @Column(length = 155, nullable = false)
    private String titulo;
   @Lob
   @Basic(fetch = FetchType.LAZY)
    private String descricao;
    @Column(length = 55)
    private String autor;
     @Column(scale=6,precision=12)
    private double tamanho;
    private boolean publico;
    @Convert(converter = LocalDateEmDate.class)
    @Column(nullable = false)
    private LocalDate dataCadastro;
   
   
    @Enumerated(EnumType.STRING)
    
    private TipoMaterialDidatico tipo;

    public MaterialDidatico() {
    }

    public MaterialDidatico(String origem, long codigo,String titulo, String descricao, String autor, double tamanho, boolean publico, LocalDate dataCadastro, TipoMaterialDidatico tipo) {
        
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.tamanho = tamanho;
        this.publico = publico;
        this.dataCadastro = dataCadastro;
        this.tipo = tipo;
        this.chave = new  MaterialDidaticoPK (origem,codigo);
    }

   
       
    
   
    public MaterialDidaticoPK getChave() {
        return chave;
    }

    public void setChave(MaterialDidaticoPK chave) {
        this.chave = chave;
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
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
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.chave);
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.autor);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.tamanho) ^ (Double.doubleToLongBits(this.tamanho) >>> 32));
        hash = 97 * hash + (this.publico ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.dataCadastro);
        hash = 97 * hash + Objects.hashCode(this.tipo);
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
        if (Double.doubleToLongBits(this.tamanho) != Double.doubleToLongBits(other.tamanho)) {
            return false;
        }
        if (this.publico != other.publico) {
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
        if (!Objects.equals(this.chave, other.chave)) {
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

  

  


