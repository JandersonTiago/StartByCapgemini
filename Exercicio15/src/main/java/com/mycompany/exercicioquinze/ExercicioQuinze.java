// 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

package com.mycompany.exercicioquinze;

import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args) {
        
        int num;
        
        System.out.println("A number between 100 and 200: ");
        
        Scanner teclado = new Scanner(System.in);
        
        num = teclado.nextInt();
        
        if(num >= 100 && num <= 200){
            System.out.println("The number is in the defined range");
        }
        else{
            System.out.println("Number out of range"); 
        }  
    }
}
