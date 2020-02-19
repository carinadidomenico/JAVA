/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Sorveteria {
    public static void main(String[] args) {
        // Solicite o tipo de produto que o usuário deseja, opções: “Casquinha”, “Sundae” e "Milkshake" 
        System.out.println("Qual o seu pedido?\n"
                            + "Casquinha\n"
                            + "Sundae\n"
                            + "Milkshake\n");
        
        Scanner leitorTexto = new Scanner(System.in);
        String pedido = leitorTexto.next();
        
        switch (pedido) {
            case "Casquinnha":
                System.out.println("Casquinha custa R$ 2,00");
                break;
            case "Sundae":
                System.out.println("Sundae custa R$5,00");
                break;
            case "Milkshake":
                System.out.println("Milkshake custa R$7,00");
                break;
            default:
                System.out.println("Digite um pedido válido");
                break;
        }
        
    }
}
