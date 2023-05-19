/*Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;*/
package com.mycompany.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número X: ");
        int x = input.nextInt();
        
        System.out.println("Digite um número Y: ");
        int y = input.nextInt();
        
        if (x > y){
            System.out.println("X > Y");
        }
        
        else if (x < y){
            System.out.println("X < Y");
        }
        
        else{
            System.out.println("X = Y");
        }
        
        input.close();
    }
}
