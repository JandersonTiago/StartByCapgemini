/*Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;*/
package com.mycompany.exercicio31;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura do valor de A
        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();
        
        // Leitura do valor de B
        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();
        
        // Leitura tipo de operação
        System.out.print("Digite o operador aritmético (+, -, *, /): ");
        char c = input.next().charAt(0);
        
        // Variavel que recebe o valor das operações
        double result;
        
        switch(c){
            case '+':
                result = a + b;
                System.out.print("A + B = " + result);
                break;
                
            case '-':
                result = a - b;
                System.out.print("A - B = " + result);
                break;
                
            case '*':
                result = a * b;
                System.out.print("A X B = " + result);
                break;
                
            case '/':
                
                // Tratamento erro de divisão por zero
                if (b != 0){
                result = a / b;
                System.out.print("A / B = " + result);
                }
                else{
                    System.out.print("Erro de divisão por zero");
                }
                break;
                
            default:
                // Resposta caso simbolo digitado seja invalido
                System.out.print("Operador invalido");
        }
        
        
    }
}
