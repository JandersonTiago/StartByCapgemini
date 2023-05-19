/*Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);*/
package com.mycompany.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura nome aluno
        System.out.println("Informe o nome do aluno:");
        String aluno = input.nextLine();
        
        // Leitura das três notas
        System.out.println("Digite o valor da primeira nota: ");
        double n1 = input.nextDouble();
        
        System.out.println("Digite o valor da segunda nota: ");
        double n2 = input.nextDouble();
        
        System.out.println("Digite o valor da terceira nota: ");
        double n3 = input.nextDouble();
        
        // Cálculo média aritmética
        double media = (n1 + n2 + n3) / 3;
        
        // Condição de aprovação
        if(media >= 7){
            System.out.printf("O aluno %s obteve média %.2f e está Aprovado", aluno, media);
        }
        // Condição de reprovação
        else if(media <= 5){
            System.out.printf("O aluno %s obteve média %.2f e está Reprovado", aluno, media);
        }
        // Condição de recuperação
        else {
            System.out.printf("O aluno %s obteve média %.2f e está em Recuperação", aluno, media);
        }
        
        input.close();
    }
}
