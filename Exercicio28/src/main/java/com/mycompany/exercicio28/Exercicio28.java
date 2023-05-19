/*Escreva um algoritmo para uma empresa que decide dar um reajuste 
a seus 584 funcionários de acordo com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
Calcule o seu novo salário reajustado. 
Escrever o nome do funcionário, o reajuste e seu novo salário. 
Calcule quanto à empresa vai aumentar sua folha de pagamento;
*/
package com.mycompany.exercicio28;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
       
       System.out.print("== Atribuir novo reajuste de salario ==\n");
       
       // Variavel que irá receber quanto à empresa vai aumentar sua folha de pagamento 
       double aumentoFolhaPagamento = 0;
       
       Scanner input = new Scanner(System.in);
        
       while(true){
           
           // Menu inicial
           System.out.println("\nEscolha uma das opções: ");
           System.out.println("1 - Reajustar salario");
           System.out.println("2 - Sair");
           
           // Leitura variavel que inicia ou finaliza o programa
           System.out.print(">> ");
           int start = input.nextInt();

           // Condição para quebra do laço (finalizar programa)
           if(start == 2){
               break;  
           }
           
           // Condição para iniciar o programa
           else if(start == 1){
               
                // Definindo valor salário minimo
                double salarioMin = 1320;
                
                // Leitura nome funcionario
                System.out.print("\nDigite o nome do funcionario: ");
                String nome = input.next();
  
                // Leitura salario funcionario
                System.out.print("Digite o salario atual do funcionario: ");
                int salarioFun = input.nextInt();
                
                // Variável que recebera o valor de aumento
                double aumento = 0;
                
                // 50% para aqueles que ganham menos do que três salários mínimos
                if(salarioFun < 3 * salarioMin){
                    aumento = salarioFun * 0.5;
                }
                
                // 20% para aqueles que ganham entre três até dez salários mínimos
                else if(salarioFun >= 3 * salarioMin && salarioFun < 10 * salarioMin){
                    aumento = salarioFun * 0.2;  
                }
                
                // 15% para aqueles que ganham acima de dez até vinte salários mínimos
                else if (salarioFun >= 10 * salarioMin && salarioFun < 20 * salarioMin){
                    aumento = salarioFun * 0.15;
                }
                // 10% para os demais funcionários
                else{
                    aumento = salarioFun * 0.1;
                }
                
                // Calculo salario com reajuste
                double novoSalario = salarioFun + aumento;
                
                // Apresentar o nome do funcionário, o reajuste e seu novo salário. 
                System.out.println("\nDados do funcionário:");
                System.out.println("Nome: " + nome);
                System.out.println("Reajuste: " + aumento);
                System.out.println("Novo Salário: " + novoSalario);
                
                // Calculo aumento folha de pagamento da empresa
                aumentoFolhaPagamento = aumentoFolhaPagamento + aumento;
           }
           
           else{
               // Opção não existe no menu
               System.out.print("\nOpção invalida!\n");
           }
  
       }
       
       // Apresentar aumento total da folha de pagamento da empresa
       System.out.println("\nTotal de aumento na folha de pagamento: " + aumentoFolhaPagamento);
       
       input.close();
    }

}
