/*22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto, o valor de venda de cada produto, 
a média de preço de custo e do preço de venda;*/

package com.mycompany.exercicio22;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        
        // Variáveis
        String nomeProduto;
        float precoProduto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        float mediaCusto;
        float mediaVenda;
        int i = 0;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitorScanner.next();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoProduto = leitorScanner.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitorScanner.nextFloat();
            
            if (precoProduto == precoVenda){
                System.out.println("Houve empate entre o "
                        + "preço do produto e o preço de venda");  
            }
            
            else if (precoProduto > precoVenda){
                System.out.println("Houve prejuízo, "
                        + "preço real do produto e maior que o preço de venda");  
            }
            else{
                System.out.println("Houve lucro, "
                        + "preço de venda é maior que o valor do produto");
            }
            
            totalCusto = totalCusto + precoProduto;
            totalVenda = totalVenda + precoVenda;
             
        }
        System.out.println("Média preço de custo:" + (mediaCusto = totalCusto/i));
        System.out.println("Média preço de venda:" + (mediaVenda = totalVenda/i));
    }
}
