package aula5;

import java.util.Scanner;

public class Soma_Pares_N {
    // Faça um algoritmo que cancule a soma dos números pares de 1 a N, onde N é um número inteiro informado pelo usuário.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para calcular a soma dos números pares de 1 a N:");
        num = sc.nextInt();

        int soma = 0;

        for(int cont = 1; cont <= num; cont++) {
            if(cont % 2 == 0) {
                soma += cont; //+= é o operador atribuição, adiciona o valor da variável cont com a variável soma e armazena o resultado em soma.
            }
        }
        System.out.println("A soma dos números pares de 1 a " + num + " é: " + soma);
    }
}