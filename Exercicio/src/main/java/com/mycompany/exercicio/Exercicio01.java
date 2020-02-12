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
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double num1 = leitor.nextDouble();
    
        System.out.println("Digite outro número: ");
        Double num2 = leitor.nextDouble();
        
        System.out.println("A soma dos números é: " + (num1 + num2));
        System.out.println("A subtração dos números é: " + (num1 - num2));
        System.out.println("A multiplicação dos números é? " + (num1 * num2));
        System.out.println("A divisão dos números é: " + (num1 / num2));
    
    }
}