/* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;*/

package com.mycompany.exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        
        // Inicialização das variáveis de contagem
        int totalPessoas = 0;
        int totalAptas = 0;
        int totalInaptas = 0;
        
        Scanner input = new Scanner(System.in);
 
        while(true){
            
            System.out.print("Deseja verificar aptidão de algum recruta? (S/N)");
            String start = input.next();
       
            if (start.equalsIgnoreCase("s")){

                System.out.print("Digite o nome: ");
                String nome = input.next();

                System.out.print("Digite o sexo (M/F): ");
                //char sexo = input.next().charAt(0);
                String sexo = input.next();

                System.out.print("Digite a idade: ");
                int idade = input.nextInt();

                System.out.print("Informe o estado de saúde (OK/NOK): ");
                //char saude = input.next().charAt(0);
                String saude = input.next();

                if(sexo.equalsIgnoreCase("m") && idade >= 18 && saude.equalsIgnoreCase("ok")){
                     System.out.println("A pessoa " + nome + " está apta para o serviço militar obrigatório.\n");
                     totalAptas++; 
                }
                else{
                     System.out.println("A pessoa " + nome + " está inapta para o serviço militar obrigatório.\n");
                     totalInaptas++;
                }

                totalPessoas++; 
            }
            else{
                break;
            }
        }
        System.out.println("\nTotal de pessoas: " + totalPessoas);
        System.out.println("Total de aptas: " + totalAptas);
        System.out.println("Total de inaptas: " + totalInaptas);
    }
}
