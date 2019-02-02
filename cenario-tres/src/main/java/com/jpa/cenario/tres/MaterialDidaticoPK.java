package com.jpa.cenario.tres;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.GenericGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cliente
 */
public class MaterialDidaticoPK implements Serializable {

    private String origem;

    private long codigo;

    public MaterialDidaticoPK() {
    }

    public MaterialDidaticoPK(long codigo, String origem) {
        this.codigo = codigo;
        this.origem = origem;

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
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.origem);
        hash = 67 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
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
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        return true;
    }

}
