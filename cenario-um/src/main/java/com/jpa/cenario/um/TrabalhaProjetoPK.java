package com.jpa.cenario.um;

import java.io.Serializable;

/**
 *
 * @author Amand
 */
public class TrabalhaProjetoPK implements Serializable{
    
    private int funcionario;
    private int projeto;

    public TrabalhaProjetoPK() {
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public int getProjeto() {
        return projeto;
    }

    public void setProjeto(int projeto) {
        this.projeto = projeto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.funcionario;
        hash = 11 * hash + this.projeto;
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
        final TrabalhaProjetoPK other = (TrabalhaProjetoPK) obj;
        if (this.funcionario != other.funcionario) {
            return false;
        }
        if (this.projeto != other.projeto) {
            return false;
        }
        return true;
    }
       
}
