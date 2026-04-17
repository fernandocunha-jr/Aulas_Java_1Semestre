package aula3;

import java.util.Scanner;

public class Num_Oque {
    // Faça um algoritmo para determinar se um número é positivo, negativo ou zero

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;

        System.out.println("Determine se um número é positivo, negativo ou zero");
        
        System.out.println("Digite um número: ");
        num = sc.nextDouble();

        if (num > 0) {
            System.out.println("O número é positivo.");

        } else if (num < 0) {
            System.out.println("O número é negativo.");
            
        } else {
            System.out.println("O número é zero.");
        }



    }

}
