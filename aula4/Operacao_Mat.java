package aula4;

import java.util.Scanner;

public class Operacao_Mat {
    // Faça um algoritmo que apresente um menu de operações matemáticas (soma, subtração, multiplicação, divisão).
    //Utilize switch case para executar a operação escolhida pelo usuário.
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de operações matemáticas");

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double valor2 = sc.nextDouble();

        switch (opcao) {
            case 1 -> {
                System.out.println("O resultado da soma é: " + (valor1 + valor2));
            }

            case 2 -> {
                System.out.println("O resultado da subtração é: " + (valor1 - valor2));
            }

            case 3 -> {
                System.out.println("O resultado da multiplicação é: " + (valor1 * valor2));
            }

            case 4 -> {
                if (valor2 != 0) {
                    System.out.println("O resultado da divisão é: " + (valor1 / valor2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            }

            default -> System.out.println("Opção inválida.");
        }
    }
}
