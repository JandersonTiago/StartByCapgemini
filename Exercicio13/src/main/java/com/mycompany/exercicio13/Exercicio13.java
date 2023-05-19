/*Faça um algoritmo que receba um número e mostre uma 
mensagem caso este número seja maior que 10;*/
package com.mycompany.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        
        if (num > 10) {
            System.out.println("Numero maior que 10!");
        }
        else if (num < 10){
            System.out.println("Numero menor que 10!");
        }
        else{
            System.out.println("Numero igual a 10!");
        }
        
        input.close();
    }
}
