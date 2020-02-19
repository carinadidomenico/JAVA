/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interpolacao;

/**
 *
 * @author Aluno
 */
public class Exemplo {
    public static void main(String[] args) {
        String nome = "Carina Di Domenico";
        String facul = "Bandtec";
        Integer n = 31;
        Double decimal = 44.3931421;
        
        String texto = String.format("Olar, %s, seja bem vindo á %s", nome, facul);
        String texto2 = String.format("Welcome to %s", facul);
        String texto3 = String.format("Meu número é %d", n);
        String texto4 = String.format("Outro número: %2f", decimal);
        
        System.out.println(texto);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
    }
}