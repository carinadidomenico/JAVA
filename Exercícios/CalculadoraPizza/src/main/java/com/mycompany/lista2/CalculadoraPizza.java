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
public class CalculadoraPizza {
    public static void main(String[] args) {
        // Solicite o valor de uma pizza.
        System.out.println("Digite o preço da pizza:");
        Scanner leitorPreco = new Scanner(System.in);
        Double preco = leitorPreco.nextDouble();
        
        // Solicite o sabor da pizza
        System.out.println("Digite o sabor da pizza:");
        Scanner leitorSabor = new Scanner(System.in);
        String sabor = leitorSabor.nextLine();
        
        // Solicite a quantidade de pessoas que irá "rachar" a conta.
        System.out.println("Digite a quantidade de pessoas para dividir a conta:");
        Scanner leitorNumero = new Scanner(System.in);
        Integer divisao = leitorNumero.nextInt();
        
        // Solicite o valor máximo que as pessoas aceitam "rachar" .
        System.out.println("Digite o valor máximo a pagar:");
        Scanner leitorValorMax = new Scanner(System.in);
        Double valorMax = leitorValorMax.nextDouble();
        
        Double valorTotal = preco / divisao;
        
        if(valorTotal <= valorMax) {
            System.out.println(String.format("A pizza de %s será dividida entre %d pessoas. R$%.2f p/ cada", sabor, divisao, valorMax));
        } else {
            System.out.println(String.format("Deu ruim no racha. A pizza deveria custar no máximo %.2f", valorMax*divisao));
        }
                
    }
}
