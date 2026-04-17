package aula2;

import java.util.Scanner;

public class Area_Circulo {
    // Faça um algoritmo para calcular a área do círculo.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double raio;
        double pi = 3.14;

        System.out.println("Calculadora de área do círculo");

        System.out.println("Qual é o raio do círculo: ");
        raio = sc.nextDouble();

        double area = pi * (raio * raio);

        System.out.println("A área do círculo é: " + area);

    }
}
