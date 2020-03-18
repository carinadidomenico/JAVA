/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoencapsulamento;

/**
 *
 * @author Aluno
 */
public class TesteConta {
    public static void main(String[] args) {
        
        ContaCorrente conta01 = new ContaCorrente();
        
        System.out.println("Depositanto 50");
        conta01.depositar50();
        conta01.depositar50();
        
        System.out.println("Saldo atual " + conta01.getSaldo());
        
        System.out.println("Sacando 50");
        conta01.sacar50();
        conta01.sacar50();
       
        System.out.println("Saldo final: " + conta01.getSaldo());        
    }
}
