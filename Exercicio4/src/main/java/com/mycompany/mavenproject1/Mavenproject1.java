/* Escreva um algoritmo que leia o nome de um vendedor, 
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o seu nome, o salário fixo e salário no final do mês;*/

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        String nome = leitorScanner.nextLine();
        
        System.out.println("Digite o total de vendas efetuadas no mês R$: ");
        double totalVendas = leitorScanner.nextDouble();
        
        double salario = 1320;
        
        double salarioFinal = salario + (totalVendas * 0.15);
        
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário R$: " + salario);
        System.out.println("Salário com comissão R$: " + salarioFinal);
        
        leitorScanner.close();
        
    }
}
