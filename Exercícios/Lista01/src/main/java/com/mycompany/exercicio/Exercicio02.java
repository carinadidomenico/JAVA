/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        
        System.out.println("Olar, " + nome + ", qual seu ano de nascimento?");
        Integer anoNasc = leitor.nextInt();
        
        System.out.println("Em 2030 você terá " + (2030 - anoNasc) + " anos");
    }
}
