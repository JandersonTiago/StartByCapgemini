/*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a 
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores 
trocados; */

package com.mycompany.exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor para A: ");
        int a  = input.nextInt();
        
        System.out.println("Digite um valor para B: ");
        int b  = input.nextInt();
        
        System.out.println("Valores iniciais:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Troca de valores:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
  
    }
}
