/*A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;*/
package com.mycompany.exercicio27;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Variaveis que acumulam valor de desconto e arrecadação
        double totalDesconto = 0;
        double totalPago = 0;
 
        while (true){
            
            // Leitura valor do veiculo
            System.out.print("Digite o valor do veículo (ou 0 para encerrar): ");
            double valor = input.nextDouble();
            
            // Condição para encerrar o programa
            if(valor == 0){
                break;
            }
            else{
            
                // Leitura modelo do veiculo
                System.out.print("Digite o modelo do veiculo: ");
                String modelo = input.next();

                // Menu tipo de combustível do veículo
                System.out.println("\nInforme o tipo de combustível:");
                System.out.println("1 - Álcool   (25 % de desconto no veículo)");
                System.out.println("2 - Gasolina (21 % de desconto no veículo)");
                System.out.println("3 - Diesel   (14 % de desconto no veículo)");
                
                // Leitura tipo de combustivel
                System.out.print(">> ");
                int combustivel = input.nextInt();
                
                // Variaveis para calculo de desconto e valor pago pelo cliente
                double desconto;
                double valorPago;

                switch(combustivel){
                    case 1:
                        desconto = valor * 0.25;
                        valorPago = valor - desconto;
                        break;

                    case 2:
                        desconto = valor * 0.21;
                        valorPago = valor - desconto;
                        break;

                    case 3:
                        desconto = valor * 0.14;
                        valorPago = valor - desconto;
                        break;

                    default:
                        System.out.println("Combustível inválido.");
                        continue;      
                }
                
                // Apresentação resultados dentro do laço infinito
                System.out.println("\nVeículo: " + modelo);
                System.out.printf("Total de desconto R$ %.2f", desconto);
                System.out.printf("\nValor final R$ %.2f\n\n", valorPago);
                
                // Acumulação descontos e valores pagos pelos clientes
                totalDesconto += desconto;
                totalPago += valorPago;
            }
            
        }
        
        /* Apresentação de somatório de todos os descontos
        e valores pagos pelos clientes*/
        System.out.println("\nTotal de desconto: R$ " + totalDesconto);
        System.out.println("Total pago pelos clientes: R$ " + totalPago);

        input.close(); 
    }
}
