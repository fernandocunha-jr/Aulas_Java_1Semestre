package aula3;

import java.util.Scanner;

public class Triangulo_Oque {
    // Faça um algoritmo para determinar se um triângulo é equilátero, isósceles ou escaleno, a partir dos seus lados. Considere as seguintes condições:
    // Equilátero: todos os lados são iguais
    // Isósceles: dois lados são iguais e um é diferente
    // Escaleno: todos os lados são diferentes


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.println("Determine se um triângulo é equilátero, isósceles ou escaleno, a partir dos seus lados.");

        System.out.println("Digite o lado 1 do triângulo: ");
        lado1 = sc.nextDouble();

        System.out.println("Digite o lado 2 do triângulo: ");
        lado2 = sc.nextDouble();

        System.out.println("Digite o lado 3 do triângulo: ");
        lado3 = sc.nextDouble();

        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("O triângulo é inválido.");

        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");

        } else {
            System.out.println("O triângulo é escaleno.");
        }

    }

}
