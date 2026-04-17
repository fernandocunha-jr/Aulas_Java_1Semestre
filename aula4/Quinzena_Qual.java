package aula4;

import java.util.Scanner;

public class Quinzena_Qual {
    // Faça um algoritmo para determinar se um dia do mês pertence à primeira ou à segunda quinzena. Considere que o mês tem 30 dias.
    //Utilize switch case para resolver o problema.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         int dia;

         System.out.println("Determine se um dia do mês pertence à primeira ou à segunda quinzena");

         System.err.println("Digite um dia do mês: ");
         dia = sc.nextInt();

            switch (dia / 16) {
                case 0:
                    System.out.println("O dia pertence à primeira quinzena.");
                    break;

                case 1:
                    System.out.println("O dia pertence à segunda quinzena.");
                    break;

                default:
                    System.out.println("Dia inválido. O mês tem apenas 30 dias.");

                
            }
        
    

    }


}
