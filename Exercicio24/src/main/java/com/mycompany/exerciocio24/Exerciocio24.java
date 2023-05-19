/* 24. Faça um algoritmo que receba “N” números e mostre positivo, 
negativo ou zero para cada número */

package com.mycompany.exerciocio24;

import java.util.Scanner;

public class Exerciocio24 {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Deseja iniciar a checagem numérica? (S/N) ");
            char opcao = leitorScanner.next().charAt(0);
            
            if(opcao == 'n' || opcao == 'N'){
                System.out.println("Checagem finalizada...");
                break;
            }
            
            else{
                System.out.println("Digite um número: ");
                int num = leitorScanner.nextInt();
                
                if (num == 0){
                    System.out.println("Valor nulo, numero: " + num);
                }
                
                else if(num < 0){
                    System.out.println("Valor negativo, numero: " + num);   
                }
                
                else{
                    System.out.println("Valor positivo, numero: " + num);
                } 
            }  
        } 
    }
}
