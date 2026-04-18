package aula5;

import java.util.Scanner;

public class Fatorial {
    // Faça um algoritmo que calcule o fatorial de um número informado pelo usuário.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para calcular o fatorial:");
        num = sc.nextInt();

        int fatorial = 1;  // =1 porque o fatorial de 0 é 1 e qualquer número multiplicado por 0 é 0. então se inicia com 1.

        for(int cont = 1; cont <= num; cont++) {
            fatorial *= cont; // *= é o operador de atribuição, multiplica o valor da variável cont com a variável fatorial;
                            // e armazena o resultado em fatorial.
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}