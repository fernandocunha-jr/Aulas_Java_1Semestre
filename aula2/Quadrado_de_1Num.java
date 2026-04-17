package aula2;

import java.util.Scanner;

public class  Quadrado_de_1Num {
    // Faça um algoritmo para calcular o quadrado de 1 número.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.println("Calculadora do quadrado de 1 número");

        System.out.println("Qual é o seu número: ");
        num = sc.nextDouble();

        num = num * num;

        System.out.println("O quadrado do número é: " + num);

    }
}
