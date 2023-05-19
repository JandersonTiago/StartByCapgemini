/*Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;*/

package com.mycompany.exercicio26;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        
        while(true){
            
            Scanner input = new Scanner(System.in);
        
            // Leitura de um número
            System.out.print("Digite um numero de 0 a 5: ");
            int num = input.nextInt();
            
            // Condição de valido
            if(num >= 0 && num < 6){
                System.out.print("O numero " + num + " está dentro do intervalo!");
                break;
            }
            
            // Condição numero invalido
            else{
                System.out.println("Número fora do intervalo, digite novamente.");
            }
            
            input.close();
        }
        
    }
}
