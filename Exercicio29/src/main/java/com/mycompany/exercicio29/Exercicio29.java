/*Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido*/
package com.mycompany.exercicio29;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        // Leitura numero do mês
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = input.nextInt();
        
        switch(mes){
            case 1:
                System.out.print(mes + " - Janeiro");
                break;
                
            case 2:
                System.out.print(mes + " - Fevereiro");
                break;
                
            case 3:
                System.out.print(mes + " - Março");
                break;
                
            case 4:
                System.out.print(mes + " - Abril");
                break;
                
            case 5:
                System.out.print(mes + " - Maio");
                break;
                
            case 6:
                System.out.print(mes + " - Junho");
                break;
                
            case 7:
                System.out.print(mes + " - Julho");
                break;
                
            case 8:
                System.out.print(mes + " - Agosto");
                break;
                
            case 9:
                System.out.print(mes + " - Setembro");
                break;
                
            case 10:
                System.out.print(mes + " - Outubro");
                break;
                
            case 11:
                System.out.print(mes + " - Novembro");
                break;
                
            case 12:
                System.out.print(mes + " - Dezembro");
            // Caso o usuário digite um número fora do intervalo (1 a 12)    
            default:
                System.out.print("Mês inválido");   
        }
        
        input.close();
    }
}
