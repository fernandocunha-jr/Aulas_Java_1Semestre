package aula8;

import java.util.Scanner;

public class Altura_Media {
//Crie um algoritmo que solicite que o usuário insire 5 alturas e armazene esses números em um vetor
//Depois exiba a média dessas alturas

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media;
        double soma = 0;
        double [] vetor = new double [5];

        System.out.println("Calcule a média de alturas.");

            for (int i = 0; i < 5; i ++) {
                System.out.println("Digite a altura número: " + (i + 1));
                vetor [i] = sc.nextDouble();

                soma += vetor [i];
            }

        media = soma / 5;
        System.out.println("A média de altura é: " + media + " metros");

        sc.close();
    }
}
