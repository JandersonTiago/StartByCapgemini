/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
*/
package com.mycompany.exercicio20;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int carrosAte2000 = 0;
        int totalGeral = 0;
        
        while(true){
            
            // Leitura do ano do modelo
            System.out.print("Informe o ano de fabricação: ");
            int ano = input.nextInt();
            
            // Leitura valor do veiculo
            System.out.print("Informe o valor do veículo: ");
            double valor = input.nextDouble();
            
            double desconto;
            
            // Desconto ano fabricação veículo até 2000
            if(ano <= 2000){
                desconto = valor * 0.12;
                // Contagem veículos até ano fabricação 2000
                carrosAte2000++;
            }
            
            //Desconto demais veiculos
            else{
                desconto = valor * 0.07;
                
            }
             
            // Calculo valor final com desconto
            double valorFinal = valor - desconto ;
            
            // Apresentação do valor de desconto
            System.out.printf("\nValor do desconto R$ %.2f ", desconto );
            // Apresentação valor a ser pago pelo criente
            System.out.printf("\nValor a ser pago pelo cliente R$ %.2f \n", valorFinal);
            
            // Contagem total de veiculos
            totalGeral++;
            
            System.out.print("\nDeseja continuar calculando descontos? (S/N): ");
            String resposta = input.next();

            /* usar equalsIgnoreCase quando quer comparar uma String, 
            sem fazer distinção entre letras maiusculas ou minusculas*/
            if (resposta.equalsIgnoreCase("N")) 
                break;
        }
            
            // Apresentação total carros ano fabricação até 2000
            System.out.println("\nTotal de carros com ano até 2000: " + carrosAte2000);
            // Apresentação total geral de veiculos
            System.out.println("Total geral: " + totalGeral);

    }

}

