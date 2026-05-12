package aula8;

import java.util.Scanner;

public class Media_5vetor {
//Crie um algoritmo que solicite que o usuário insire 5 números inteiros e armazene esses números em um vetor
//Depois exiba a média desses números

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0;
        double soma = 0;
        int [] vetor = new int [5];

        System.out.println("Média de 5 números, armazenados no vetor.");

            for (int i = 0; i < 5; i ++) {
                System.out.println("Digite o valor número " + (i + 1));
                vetor [i] = sc.nextInt();

                soma += vetor [i];
            }

        media = soma / 5;
        System.out.println("A média do vetor é: " + media);

        sc.close();
    }
}
