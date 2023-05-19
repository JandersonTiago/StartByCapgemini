/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;*/

package com.mycompany.exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Solicita ao usuário o preço de custo do produto
        System.out.println("Informe o preço de custo do produto R$: ");
        double custo = input.nextDouble();
        
        // Solicita ao usuário o percentual de acrécimo no preço
        System.out.println("Informe o percentual de acréscimo (em %): ");
        double lucro = input.nextDouble();
        
        double total = custo + (custo * lucro/100);
        
        // Exibe o resultado do valor de venda
        System.out.printf("Valor de venda R$: %.2f", total);
        
        input.close();
    }
}
