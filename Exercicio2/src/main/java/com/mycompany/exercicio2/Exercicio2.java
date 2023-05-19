/* 2. Faça um algoritmo que receba dois números e ao final mostre a 
soma, subtração, multiplicação e a divisão dos dois números lidos;*/

package com.mycompany.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro: ");
        int x = leitorScanner.nextInt();
        
        System.out.println("Digite um valor inteiro novamente: ");
        int y = leitorScanner.nextInt();
        
        int soma = x + y;
        System.out.println(x + " + " + y + " = " + soma);
        
        int subtracao = x - y;
        System.out.println(x + " - " + y + " = " + subtracao);
        
        int multiplicacao = x * y;
        System.out.println(x + " X " + y + " = " + multiplicacao);
        
        int divisao = x / y;
        System.out.println(x + " / " + y + " = " + divisao);
    }
}
