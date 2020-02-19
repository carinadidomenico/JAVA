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
public class SistemaDesconto {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
                
        // Solicite o valor do produto escolhido
        System.out.println("Digite o preço do produto:");
        Double preco = leitor.nextDouble();
        
        // Solicite o código de desconto.
        System.out.println("Digite o código do desconto:\n"
                            + "1 = 5%\n"
                            + "2 = 10%\n"
                            + "3 = 20%\n"
                            + "4 = 50%");
        Integer codigo = leitor.nextInt();
        
        // Exiba o valor do produto sem desconto.
        System.out.println(String.format("Preço sem desconto: %.2f", preco));
        
        // Exiba o valor do produto com o desconto.
        switch (codigo){
            case 1:
                System.out.println(preco * 0.05);
                break;
            case 2:
                System.out.println(preco * 0.1);
                break;
            case 3:
                System.out.println(preco * 0.2);
            case 4:
                System.out.println(preco * 0.5);
                break;
        // Exiba uma mensagem de código inválido caso o usuário digite um código inexistente.
            default:
                System.out.println("Código de desconto inválido!");
                break;
        }
    }
}
