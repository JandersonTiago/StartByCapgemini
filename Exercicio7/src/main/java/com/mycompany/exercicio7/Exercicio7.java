/* Leia uma temperatura em graus Celsius e apresentá-la convertida em 
graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, 
sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;*/
package com.mycompany.exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        double tempCelsius = input.nextDouble();
        
        double tempFahrenheit = (9 * tempCelsius + 160) / 5;
        
        System.out.println("Temperatura em graus Fahrenheit: " 
                + tempFahrenheit + "ºF");
        
        input.close();
    }
}
