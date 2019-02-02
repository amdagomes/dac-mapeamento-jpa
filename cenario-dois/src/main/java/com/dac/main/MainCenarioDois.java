package com.dac.main;

import com.dac.cenario.dois.Concerto;
import com.dac.cenario.dois.ConcertoDAO;
import com.dac.cenario.dois.Funcao;
import com.dac.cenario.dois.Funcionario;
import com.dac.cenario.dois.Oficina;

/**
 *
 * @author Amand
 */
public class MainCenarioDois {
    public static void main(String[] args) {
        Oficina ofcina = new Oficina("rua", "bairro", "cidade", 0);
        Funcionario funcionario = new Funcionario("Mick", "111.111.111-11", 
                                                   "123412", 1000, Funcao.EMPREGADO, ofcina);
        Funcionario funcionario2 = new Funcionario("Job", "111.111.111-11", 
                                                   "123412", 1000, Funcao.EMPREGADO, ofcina);
        Concerto concerto = new Concerto(30, funcionario, ofcina);
        ConcertoDAO.salvarOficina(ofcina);
        ConcertoDAO.salvarFuncionario(funcionario);
        ConcertoDAO.salvarFuncionario(funcionario2);
        ConcertoDAO.salvarConcerto(concerto);
    }
}
