/*Escreva um algoritmo para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorrida pelo automóvel 
e o total de combustível gasto;*/

package com.mycompany.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Informe a distancia da viajem (KM): ");
        float distanciaPercorrida = leitorScanner.nextFloat();
        
        System.out.println("Informe o total de combustível gasto na viajem (L): ");
        float combustivelGasto = leitorScanner.nextFloat();
        
        float consumoMedio = distanciaPercorrida / combustivelGasto;
        
        System.out.printf("Consumo médio do altomóvel: %.2f KM/L " ,consumoMedio);
        
    }
}
