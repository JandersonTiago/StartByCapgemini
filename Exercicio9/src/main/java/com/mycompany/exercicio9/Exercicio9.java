/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m;*/
package com.mycompany.exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Solicita ao usuario o valor de deposito
        System.out.println("Informe o valor para deposito R$");
        double deposito = input.nextDouble();
        
        // Calcula o saldo após um mês, considerando o valor de rendimento
        double saldoMes = deposito + (deposito * (0.07 / 100));
        
        // Apresenta o valor total com rendimento na tela
        System.out.printf("Saldo com rendimento após um mês R$ %.2f",
                saldoMes);
        
        input.close();
    }
}
