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
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Solicite ao usuário o limite de peso de um elevador (número real)
        System.out.println("Digite o peso limite do elevador:");
        Double peso = leitor.nextDouble();

        // Solicite ao usuário o limite de pessoas em um elevador (número inteiro)
        System.out.println("Digite o número de pessoas no elevador:");
        Integer pessoas = leitor.nextInt();

        // Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real)
        // Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real)
        // Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real)
        
        System.out.println("Digite o peso da primeira pessoa: ");
        Double pesoTotal = leitor.nextDouble();
        System.out.println("Digite o peso da segunda pessoa: ");
        pesoTotal += leitor.nextDouble();
        System.out.println("Digite o peso da terceira pessoa: ");
        pesoTotal += leitor.nextDouble();
        
        System.out.println(pesoTotal);
        
          
        
    }
}
