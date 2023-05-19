/*Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo 
entre 10 (inclusive) e 150 (inclusive);*/
package com.mycompany.exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numerosIntervalo = 0;
        
        for(int i = 1; i <= 7; i++){
            
            System.out.printf("Digite o número %dº: ", i);
            int num = input.nextInt();
            
            if (num >= 10 && num <= 150){
                numerosIntervalo ++;
            }  
        }
        
        System.out.printf("Dos 7 números digitados, "
                + "%d estão no intervalo entre 10 e 150.", numerosIntervalo);
        
        input.close();
    }
}
