/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estruturas.repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstruturaRepeticao {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        
        // Exemplo WHILE
        Integer cont = 1;
        while (cont <= 6) {
            System.out.println("Arrivederci!" + cont);
            cont++;
        }
        
        // Exemplo FOR 
        for (Integer i = 1; i <= 6; i = i+2) {
            System.out.println("Au revoir!" + i);
        }
        
        //Exemplo DO-WHILE
        cont = 5;
        do {
            System.out.println(cont);
            cont--;
        } while (cont >= 0);
        
        do {
            System.out.println("Digite um número par:");
            numero = leitor.nextInt();
        } while (numero % 2 != 0);
        
        // Exemplo WHILE
        while (numero % 2 == 0) {
            System.out.println("Digite um número ímpar:");
            numero = leitor.nextInt();
        }
        
    }
}
