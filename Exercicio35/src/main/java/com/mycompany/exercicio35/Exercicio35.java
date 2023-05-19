/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29*/
package com.mycompany.exercicio35;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura consumo KW/h
        System.out.print("Informe o consumo de energia em KW/h: ");
        double consumo = input.nextDouble();
        
        // Menu tipo cliente
        System.out.println("\nInforme o tipo de cliente:");
        System.out.println("R - Residência");
        System.out.println("C - Comércio");
        System.out.println("I - Industria");
        
        /* Leitura tipo cliente
        toUpperCase Converter para maiúsculas
        se a entrada for maiúscula ele mantem maiúscula*/
        String tipoCliente = input.next().toUpperCase();
        
        double valorKwh;
        
        switch(tipoCliente){
            case "R":
                valorKwh = 0.6;
                break;
                
            case "C":
                valorKwh = 0.48;
                break;
                
            case "I":
                valorKwh = 1.29;
                break;
                
            default:
                System.out.print("Tipo de cliente inválido.");
                return;
        }
        
        // Cálculo valor final da conta 
        double valorConta = consumo * valorKwh;
        System.out.println("O valor da conta de luz é: R$" + valorConta);
        
        input.close();
    }
}
