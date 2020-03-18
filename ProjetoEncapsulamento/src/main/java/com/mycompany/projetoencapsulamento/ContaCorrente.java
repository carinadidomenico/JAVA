/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoencapsulamento;

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    
    // Inicia as variáveis privadas (só aparecem nesta classe)
    private Double saldo = 0.0;
    private Integer operacoes = 0;
    
    // Método que retorna o valor do saldo
    public Double getSaldo() {
        return saldo;
    }
    
    // Método que retorna a quantidade de operações
    public Integer getOperacoes() {
        return operacoes;
    }
    
    // Método que atribui um valor á variável saldo
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    //  Método que adiciona 50 ao saldo
    void depositar50() {
        saldo += 50;
        realizarOperacao();
        // ou operacoes++ sem o método acima
    }
    
    // Método que subtrai 50 do saldo
    void sacar50() {
        if(saldo >= 50) {
            saldo -= 50;
            realizarOperacao();
            // ou operaçoes++ sem o método acima
        }
    }
    
    // Método que realiza a contagem das operações
    void realizarOperacao() {
        operacoes++;
    }
        
}
