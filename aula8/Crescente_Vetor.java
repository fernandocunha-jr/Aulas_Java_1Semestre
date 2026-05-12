package aula8;

import java.util.Arrays;
import java.util.Scanner;

public class Crescente_Vetor {
//Crie um algoritmo que solicite que o usuário insire 10 números inteiros e armazene esses números em um vetor
//Depois exiba esses números ordenando em ordem crescente

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int [10];

        System.out.println("Exbição do vetor em ordem crescente.");

            for (int i = 0; i < 10; i ++) {
                System.out.println("Digite o valor número " + (i + 1));
                vetor [i] = sc.nextInt();
            }

            Arrays.sort(vetor); //Ordena automaticamente em ordem crescente, (vetor = o que está sendo ordenado)

            System.out.println("Números do vetor em ordem crescente: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(vetor[i]);
            }

        sc.close();
    }
}
