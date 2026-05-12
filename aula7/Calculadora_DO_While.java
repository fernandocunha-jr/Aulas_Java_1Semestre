package aula7;

import java.util.Scanner;

public class Calculadora_DO_While {
//Crie um algoritmo que simula uma calculadora simples. O usuário deve fornecer dois números e escolher a opercação desejada (+, -, *, /)
//O algoritmo deve continuar perguntando se o usuário deseja continuar calculando
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continua;
        double num1, num2;
        char operacao;

        System.out.println("Calculadora de 2 números");

        do {
            System.out.print("Qual é o primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Qual é o segundo número: ");
            num2 = sc.nextDouble();

            System.out.print("Digite a operação desejada (+, -, *, /): ");
            operacao = sc.next().charAt(0);

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
                System.out.println("Operação inválida. Escolha entre +, -, *, /.");
                operacaoValida = false;
            }

        //Mostra o resultado antes de perguntar se quer continuar
                System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar? (Sim/Nao): ");
            continua = sc.next();

        } while (continua.equalsIgnoreCase("Sim")); //.equals, compara String e IgnoreCase para aceitar qualquer escrita de Sim e Não

        System.out.println("Encerrando a calculadora. Até logo!");
        sc.close();
    }
}