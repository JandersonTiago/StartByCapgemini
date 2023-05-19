/*Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele; 
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;*/

package com.mycompany.exercicio32;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura lados do triângulo
        System.out.print("Digite o valor do primeiro lado do triangulo: ");
        int a = input.nextInt();
        
        System.out.print("Digite o valor do segundo lado do triangulo: ");
        int b = input.nextInt();
        
        System.out.print("Digite o valor do terceiro lado do triangulo: ");
        int c = input.nextInt();
        
        // Validação triângulo
        if (a + b < c || a + c < b || c + b < a){
            System.out.print("Os valores informados não podem formar um triângulo.");
        }
        else{
            // Condição triângulo Equilátero
            if(a == b && b == c){
                System.out.print("Triângulo Equilátero");   
            }
            // Condição triângulo Isóscele
            else if(a == b || a == c || b == c){
                System.out.print("Triângulo Isóscele");
            }
            // Condição triangulo Escaleno 
            else{
                System.out.print("Triângulo Escaleno");
            }
        }
        
        input.close();

    }
    
}
