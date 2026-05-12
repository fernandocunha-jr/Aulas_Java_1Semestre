package aula8;

import java.util.Scanner;

public class Posicao_Vetor {
//Crie um algoritmo qque leia 5 números inteiros e armazene esses números em um vetor
//Depois o programa deve verificar se o número fornecido pelo usuário está no vetor e se estiver exiba em qual posição ele está

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int busca;
        boolean encontrado;
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor número " + (i + 1));
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite o número que deseja buscar:");
        busca = sc.nextInt();

        encontrado = false; //Assume que não está no vetor

        for (int i = 0; i < 5; i++) {
            if (vetor[i] == busca) { //O número no vetor tem que ser igual da busca
                System.out.println("Número " + busca + " encontrado na posição " + (i + 1));
                encontrado = true; //Achou muda para true
            }
        }

        if (!encontrado) { //Não exibe o não encontrado (encontrado = false)
            System.out.println("Número " + busca + " não encontrado no vetor.");
        }

        sc.close();
    }
}