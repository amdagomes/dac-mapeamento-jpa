/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.main;


import com.jpa.cenario.tres.TipoMaterialDidatico;
import com.jpa.cenario.tres.MaterialDidaticoDao;
import com.jpa.cenario.tres.MaterialDidatico;
import java.time.LocalDate;

/**
 *
 * @author Cliente
 */
public class NewMain {

    
    public static void main(String[] args) throws Exception {
     
        MaterialDidaticoDao dao = new   MaterialDidaticoDao();
       
   
         MaterialDidatico mat = new MaterialDidatico("origem",100,"titulo","descricao","autor",100,
                 true,LocalDate.now(),TipoMaterialDidatico.APRESENTACAO);
          MaterialDidatico mat2 = new MaterialDidatico("origem",111,"titulo","descricao","autor",100,true,LocalDate.now(),TipoMaterialDidatico.APRESENTACAO);
         dao.salvar(mat);
         dao.salvar(mat2);
             
      
        
    }
    
}
