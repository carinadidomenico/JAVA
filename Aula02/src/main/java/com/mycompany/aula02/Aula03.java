/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula03 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2)/2;
        
        if (media >= 5) {
            System.out.println("Você passou!");
        }
        else {
            System.out.println("Você foi reprovado :(");
        }
        
        switch(media >=5) {
            case true: System.out.println("Aprovado!");
            break;
            case false: System.out.println("Reprovado.");
            break;
        }
                
    }
}
