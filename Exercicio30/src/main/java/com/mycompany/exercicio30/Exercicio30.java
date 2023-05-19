/*Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;*/
package com.mycompany.exercicio30;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
   
        int[] numeros = new int[3];
        
        for(int i = 1; i <= 3; i++){
            System.out.printf("Digite o %dº número: ", i);
            
            //A primeira posição do Array é [0] e a variavel i começa em 1,
            numeros[i-1] = input.nextInt(); 
        }
        
        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        //Imprime os valores em ordem crescente
        System.out.println("\nValores em ordem crescente: ");
        
        /*For-each é um laço For que busca uma correspondência pré-determinada para funcionar.
        Em vez de declarar uma variável para contar os loops que serão usados durante a operação,
        você vai declarar o tipo da variável seguido do nome do array utilizado durante a execução da aplicação.*/
        for (int valor : numeros) {
            System.out.println(valor);
        }
        
        input.close();
    }
}
