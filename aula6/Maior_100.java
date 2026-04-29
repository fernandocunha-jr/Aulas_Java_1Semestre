package aula6;

import java.util.Scanner;

public class Maior_100 {
    //Faça um algoritmo que pede para o usuário digitar números até que a soma dos números digitados seja maior que 100.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        double soma = 0;

        while (soma <= 100) {
            System.out.println("Digite um número inteiro positivo:");
            num = sc.nextDouble();

            soma += num;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
