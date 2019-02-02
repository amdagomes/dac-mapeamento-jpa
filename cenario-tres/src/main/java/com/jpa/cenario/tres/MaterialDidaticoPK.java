package com.jpa.cenario.tres;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */

@Embeddable


public class MaterialDidaticoPK implements Serializable  {
    @Column(length = 45, nullable = false)
    private String origem;
 
    private long codigo;

    public MaterialDidaticoPK() {
    }

    public MaterialDidaticoPK(String origem,long codigo) {
        this.origem = origem;
        this.codigo=codigo;
       
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.origem != null ? this.origem.hashCode() : 0);
        hash = 37 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
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
        final MaterialDidaticoPK other = (MaterialDidaticoPK) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.origem == null) ? (other.origem != null) : !this.origem.equals(other.origem)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
