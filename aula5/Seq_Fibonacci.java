package aula5;

import java.util.Scanner;

public class Seq_Fibonacci {
    // Faça um algoritmo que imprima os primeiros N termos da sequência de Fibonacci, onde N é um número inteiro informado pelo usuário.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para imprimir os primeiros N termos da sequência de Fibonacci:");
        num = sc.nextInt();

        int fib1 = 0, fib2 = 1, fib3;

        System.out.print("Os primeiros " + num + " termos da sequência de Fibonacci são: ");

        for(int cont = 1; cont <= num; cont++) {
            switch (cont) {
                case 1 -> {
                    System.out.print(fib1 + " "); // Imprime o primeiro termo da sequência de Fibonacci (0) e um espaço em branco.
                    break; 
                }

                case 2 -> {
                    System.out.print(fib2 + " "); // Imprime o segundo termo da sequência de Fibonacci (1) e um espaço em branco.
                    break;
                }

                default -> {
                    fib3 = fib1 + fib2; // Calcula o próximo termo da sequência de Fibonacci somando os dois termos anteriores (fib1 e fib2).
                    System.out.print(fib3 + " "); // Imprime o próximo termo da sequência de Fibonacci (fib3) e um espaço em branco.

                    fib1 = fib2; //Esquece o valor antigo de fib1 e assumi o valor de fib2 para o proximo loop;

                    fib2 = fib3;//Esquece o valor antigo de fib2 e assumi o valor de fib3 para o proximo loop;
                    break;
                }
            }
        }
    }
}