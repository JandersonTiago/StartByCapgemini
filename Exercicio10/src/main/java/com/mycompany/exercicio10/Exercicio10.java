/*A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/

package com.mycompany.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Loja Mamão com Açucar");
        
        // Solicita ao usuário o valor da compra
        System.out.println("Informe o valor da compra R$: ");
        double valor = input.nextFloat();
        
        // Calcula o valor das prestações (em 5 vezes sem juros) 
        double valorPrestacoes = valor / 5;
        
        // Apresenta o valor das prestações na tela
        System.out.printf("Valor das prestações: 5X de R$ %.2f", valorPrestacoes);
        
        input.close();
    }
}
