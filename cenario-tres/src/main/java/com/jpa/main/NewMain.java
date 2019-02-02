/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.main;

import com.jpa.cenario.tres.TipoMaterialDidatico;
import com.jpa.cenario.tres.MaterialDidaticoDao;
import com.jpa.cenario.tres.MaterialDidatico;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author Cliente
 */
public class NewMain {

    public static void main(String[] args) throws Exception {

        MaterialDidaticoDao dao = new MaterialDidaticoDao();

 
        MaterialDidatico mat;
        mat = new MaterialDidatico("origem", "titulo", "descricao", "autor", 100,
                true ,TipoMaterialDidatico.APRESENTACAO);
        MaterialDidatico mat2 = new MaterialDidatico("origem2", "titulo2", "descricao", "autor2", 100,
                true,TipoMaterialDidatico.VIDEOAULA);
        
        dao.salvar(mat);
        dao.salvar(mat2);

    }

}
