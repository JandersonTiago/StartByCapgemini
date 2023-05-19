/*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
que ele obteve no semestre. 
No finalinformar o nome do aluno e a sua média (aritmética);*/

package com.mycompany.exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno");
        String nome = input.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        Double nota1 = input.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota2 = input.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        Double nota3 = input.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        
        input.close();
    }
}
