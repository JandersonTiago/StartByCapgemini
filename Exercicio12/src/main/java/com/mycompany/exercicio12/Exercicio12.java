/*O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo;*/

package com.mycompany.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Leitura do custo de fábrica do veiculo
        System.out.println("Informe o custo de produção do veiculo R$ ");
        double custoFabrica = input.nextDouble();
        
        // 45 % sobre o custo de fabricação
        double impostos = custoFabrica * 0.45;
        
        // 28% sobre custo de fabricação mais impostos aplicados anteriormente
        double distribuidor = (custoFabrica + impostos) * 0.28;
        double custoConsumidor = custoFabrica + impostos + distribuidor;
        
        System.out.printf("Custo do carro novo ao consumidor R$ %.2f", custoConsumidor);
    }
}
