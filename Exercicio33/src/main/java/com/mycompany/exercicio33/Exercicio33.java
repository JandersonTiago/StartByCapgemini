/*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
*/

package com.mycompany.exercicio33;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura numero de horas/aula trabalhadas
        System.out.print("Informe o número de horas-aula trabalhadas: ");
        double horasAula = input.nextInt();
        
        // Leitura nível professor
        System.out.print("Informe o nível do professor (1, 2 ou 3): ");
        int nivel = input.nextInt();
        
        double salario;
        
        switch (nivel){
            case 1:
                salario = horasAula * 12;
                break;
            
            case 2:
                salario = horasAula * 17;
                break;
            
            case 3:
                salario = horasAula * 25;
                break;
            
            default:
                System.out.print("Nível inválido.");
                return;
        }
        
        System.out.println("O salário do professor é: R$" + salario);
        
        input.close();
        
    }
}
