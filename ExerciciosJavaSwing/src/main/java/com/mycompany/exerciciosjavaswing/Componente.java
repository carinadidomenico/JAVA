/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosjavaswing;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Componente {
    String cor;
    String texto;
    Integer valor;
    Random gerador = new Random();
    
    void atualizar() {
        
        valor = gerador.nextInt(101);
                
        if(valor <= 0 && valor <= 20) {
            texto = "Suave";
            cor = "#00008b";
        } else if(valor > 20 && valor < 70) {
            texto = "Atenção";
            cor = "#c8a2c8";
        } else {
            texto = "Crítico";
            cor = "#8b0000";
            
        }
    }
}
