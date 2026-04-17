package aula5;

public class Num_Pares {
    // Faça um algoritmo que leia números inteiros e mostre quais são os números pares.

    public static void main(String[] args) {

        System.out.println("Digite um número de 0 a 50:");
        int inicio = 0;
        int fim = 50;

        for(int cont = inicio; cont <= fim; cont++) {
            if (cont % 2 == 0) {
                System.out.println("O número " + cont + " é par.");
            }
        }
    }
}
