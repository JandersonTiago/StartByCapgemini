/*Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
menor que 25 ou igual a 40;*/
package com.mycompany.exercicio23;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        
        if(num > 80){
            System.out.print("O numero é maior que 80.");
        }
        else if(num < 25){
            System.out.print("O numero é menor que 25.");
        }
        else if(num == 40){
            System.out.print("O numero é igual a 40.");
        }
        else{
            System.out.print("O número não se enquadra nas condições especificadas.");
        }
        
        input.close();
    }
}
