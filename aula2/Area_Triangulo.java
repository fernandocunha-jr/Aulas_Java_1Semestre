package aula2;

import java.util.Scanner;

public class Area_Triangulo {
    // Método para calcular a área do triângulo

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        
        System.out.println("Calculadora de área do triângulo");

        System.out.println("Qual é a base do triângulo: ");
        base = sc.nextDouble();

        System.out.println("Qual é a altura do triângulo: ");
        altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
