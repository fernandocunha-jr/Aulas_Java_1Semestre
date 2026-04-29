package aula6;

import java.util.Scanner;

public class Soma_While {
    //Faça um algoritmo que pede para o usuário digitar números inteiros positivos. O algoritmo deve somar os números e mostrar o resultado.
    //Encerrar o programa quando o usuário digitar um número negativo.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        while (num >= 0) {
            soma += num; // soma = soma + num;

            System.out.println("Digite um número inteiro positivo (ou um número negativo para encerrar):");
            num = sc.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
