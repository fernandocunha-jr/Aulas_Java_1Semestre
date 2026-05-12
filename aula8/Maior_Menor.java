package aula8;

import java.util.Scanner;

public class Maior_Menor {
//Crie um algoritmo que solicite que o usuário insire 5 números inteiros e armazene esses números em um vetor
//Depois exiba qual é o maior e menor número

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior;
        int menor;
        int [] vetor = new int [5];

        System.out.println("Exibição do maior e menor número do vetor");

            for (int i = 0; i < 5; i ++) {
                System.out.println("Digite o valor número " + (i + 1));
                vetor [i] = sc.nextInt();
            }

            maior = vetor [0] ;
            menor = vetor [0];

            for (int i = 1; i < 5; i ++) {
                if (vetor [i] > maior) {
                    maior = vetor [i];
                }else if (vetor [i] < menor) {
                    menor = vetor [i];
                }
            }

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);

        sc.close();
    }
}