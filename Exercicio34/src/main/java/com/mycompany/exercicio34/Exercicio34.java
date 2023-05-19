/*Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.*/

package com.mycompany.exercicio34;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura idade do nadador
        System.out.print("Digite a idade do nadador: ");
        int idade = input.nextInt();

        if(idade > 4 && idade < 8){
            System.out.print("Infantil A");
        }
        else if(idade > 7 && idade < 11){
            System.out.print("Infantil B");
        }
        else if(idade > 10 && idade < 14){
            System.out.print("Juvenil A");
        }
        else if(idade > 13 && idade < 18){
            System.out.print("Juvenil B");
        }
        else if(idade > 17 && idade < 26){
            System.out.print("Sênior");
        }
        else{
            System.out.print("Categoria não encontrada");
        }
        
        input.close();
    }
}
