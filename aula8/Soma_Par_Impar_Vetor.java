package aula8;

import java.util.Scanner;

public class Soma_Par_Impar_Vetor {
/*Escreva um algoritmo que leia a quantidade de números inteiros que o usuário desejar informar no vetor, e os armazene em um vetor.
Em seguida, o programa deve exibir asoma dos números pares e a soma dos números ímpares.*/

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numeros = new int[100];
            
            int quantidade = 0;
            
            int somaPares = 0;
            
            int somaImpares = 0;
            
            System.out.println("Soma de Pares e Ímpares");
            
            System.out.print("Quantos números deseja informar? ");
            int total = sc.nextInt();
            
            for (int i = 0; i < total; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
                quantidade++;
            }
            
            for (int i = 0; i < quantidade; i++) {
                if (numeros[i] % 2 == 0) {
                    somaPares += numeros[i];
                } else {
                    somaImpares += numeros[i];
                }
            }
            
            System.out.println("Resultados");
            
            System.out.print("Números informados: ");
            for (int i = 0; i < quantidade; i++) {
                System.out.print(numeros[i]);
                if (i < quantidade - 1) System.out.print(", ");
            }
            
            System.out.println();
            
            System.out.println("Soma dos pares:   " + somaPares);
            System.out.println("Soma dos ímpares: " + somaImpares);
        }
    }
}