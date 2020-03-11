/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosjavaswing;

/**
 *
 * @author Aluno
 */
public class ClasseCofrinho {
    
    Integer saldo = 0;
    
    // VOID indica que o método não retorna valor
    void sacar(){
        
        // Se saldo for 0, não decrementa valor;
        if((saldo -50) >= 0) {
            saldo -= 50;
        }
    }
    
    void depositar() {
        saldo += 50;
    }
    
    void quebrarCofrinho() {
        saldo = 0;
    }
    
}
