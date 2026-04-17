package aula3;

import java.util.Scanner;

public class Calculadora_2digitos {
    // Faça um algoritmo para calcular a soma, subtração, multiplicação e divisão de 2 números.
    // Utilize estrutura de decisão para resolver o problema.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Calculadora de 2 números");

        System.out.println("Qual é o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.println("Qual é o segundo número: ");
        num2 = sc.nextDouble();

        System.err.println("Digite a operação que deseja realizar: (+, -, *, /)");
        char operacao = sc.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao == '+') {
            resultado = num1 + num2;

        } else if (operacao == '-') {
            resultado = num1 - num2;

        } else if (operacao == '*') {
            resultado = num1 * num2;

        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;

            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                operacaoValida = false;
            }
        } else {
            System.out.println("Operação inválida. Por favor, escolha entre +, -, *, /.");
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.err.println("O resultado da operação é: " + resultado);
        }

    }

}
