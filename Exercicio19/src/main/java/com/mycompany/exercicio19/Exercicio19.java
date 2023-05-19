/*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;*/

package com.mycompany.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         int homens = 0;
         int mulheres = 0;
        
        for(int i = 1; i <= 7; i++){
            // Leitura do nome
            System.out.printf("Digite o %dº nome: ", i);
            String nome = input.next();
            
            // Leitura do sexo da pessoa
            System.out.printf("Sexo dessa pessoa (M/F): ");
            char sexo = input.next().charAt(0);
            
            // Condicionais
            if (sexo == 'm' || sexo == 'M'){
                System.out.println("Nome: " + nome + " Sexo: Masculino");
                homens = homens + 1;
            }
            else if (sexo == 'f' || sexo == 'F'){
                System.out.println("Nome: " + nome + " Sexo: Feminino");
                mulheres = mulheres + 1;
            }
            else{
                System.out.println("Caractér invalido "
                        + "para se referir ao sexo dessa pessoa");
            }
              
        }
        
        // Resultado final
        System.out.println("Total de homens: " + homens);
        System.out.println("Total de mulheres: " + mulheres);
        
        input.close();
    }
}
