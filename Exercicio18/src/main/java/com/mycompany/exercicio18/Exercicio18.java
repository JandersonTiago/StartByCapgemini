/*Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;*/
package com.mycompany.exercicio18;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i <= 7; i++){
            System.out.printf("Digite a idade %dª pessoa: ", i);
            int idade = input.nextInt();
            
            if (idade < 18){
                System .out.println("Menor de idade.");
            }
            else{
                System .out.println("Maior de idade.");
            }
            
        }
        
        input.close();
    }
}
