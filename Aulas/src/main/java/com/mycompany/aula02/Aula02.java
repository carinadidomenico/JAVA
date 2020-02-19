/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula02 {
    
    public static void main(String[] args) {
        Integer idade, numero;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = leitor.nextInt();
        
        // IF E IF ELSE
        if(idade >= 18) {
            System.out.println("Já pode tirar CNH!");
        }
        
        System.out.println("Digite um númeto inteiro: ");
        numero = leitor.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        }
        else {
            System.out.println(numero + " é impar.");
        }
        
        System.out.println("Digite o nome da sua faculdade: ");
        String faculdade = leitor.next();
        // Cada leitor possui um espaço na memória
        // Quando usar nextLine(), utilizar um Scanner diferente para strings
        // O nextLine() considera tudo até o ENTER, e dá erro quando recebe o valor seguinte
        
        // Método comparativo de strings e numeros .equals()
        if (faculdade.equals("Bandtec")) {
            System.out.println("Você é um SUPESTAGIÁRIO!");
        }
        
        // VALORES RANDÔMICOS
        // Simular valor de um dado
        Random aleatorio = new Random();
        
        Integer valorDado = aleatorio.nextInt(6) + 1;
        // System.out.println("O valor sorteado é: " + valorDado);
        
        System.out.println("Chute o valor do dado: ");
        Integer chute = leitor.nextInt();
        
        if (valorDado.equals(chute)) {
            System.out.println("Parabéns, você acertou!");            
        }
        else {
            System.out.println("Tente outra vez...");
        }
        
        // SWITCH CASE  
        
        System.out.println("\nDigite um numero de 1 a 7: ");
        Integer diaSemana = leitor.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3: 
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta feira");
                break;
            case 6: 
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }
        
        System.out.println("Digite a posição: " + 
                            "\n1ª posição" +
                            "\n2ª posição" +
                            "\n3ª posição");
        Integer posicao = leitor.nextInt();
        System.out.print("Você ganhou ");
        switch (posicao) {
            case 1: System.out.print("um pleisteixo");
            case 2: System.out.print(", um patins");
            case 3: System.out.print(" e uma Susi.");
            break;
            default: System.out.print("um jogo da vida.");
            break;
        }
        
    }
}