/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares 
disponíveis com ousuário;*/

package com.mycompany.exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor em dolares US$: ");
        double dolar = input.nextDouble();
        
        System.out.println("Digite o valor da cotação do dolar: ");
        double cotacaoDolar = input.nextDouble();
        
        double real = dolar * cotacaoDolar;
        
        System.out.printf("Câmbio para R$ %.2f", real);
        
        input.close();
  
    }
}
