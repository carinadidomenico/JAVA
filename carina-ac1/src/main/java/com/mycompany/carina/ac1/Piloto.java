/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carina.ac1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Piloto {
    
    public static void main(String[] args) {
        
        String nome;
        Integer horas = 0;
        Integer totalHoras = 0;
        System.out.println("funcionar");
        Scanner leitor = new Scanner(System.in);
               
        
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        
        if(horas >= 0 && horas <= 6) {
            do{
                System.out.println("Digite as horas do último voo:");
                horas = leitor.nextInt();
                totalHoras += horas;
                System.out.println(String.format("%s agora tem um total de %d horas de vôo.", nome, totalHoras));
                if (horas == 0 || horas > 6) {
                System.out.println("Quantidade inválida! Não será registrada!");
            }
            } while(horas > 0 || horas <= 6);
                                       
        } else {
            System.out.println(String.format("%s se aposentou após fazer acumulando %d horas!", nome, totalHoras ));
        }
    }    
}
