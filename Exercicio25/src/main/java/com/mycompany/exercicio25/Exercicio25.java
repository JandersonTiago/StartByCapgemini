/*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;*/
package com.mycompany.exercicio25;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Leitura dos dois numeros
        System.out.print("DIgite um valor para X: ");
        int x = input.nextInt();
        System.out.print("DIgite um valor para Y: ");
        int y = input.nextInt();
        
        // Condição de igualdade
        if(x == y){
            System.out.print("Os numeros são iguais.");
        }
        
        // Condição de desigualdade
        else{
            System.out.println("Os numeros são diferentes.");
            
            // Condição X > Y
            if(x > y){
                System.out.print("X > Y");
            }
            
            // Condição X < Y
            else{
                System.out.print("X < Y");
            }
        }
        
        input.close();
    }  
}
