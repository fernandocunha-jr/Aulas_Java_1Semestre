package aula2;

import java.util.Scanner;

public class Media_3valores {
        // Faça um algoritmo que leia 3 valores e calcule a média entre eles.
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0;

        System.out.println("Calculadora de média entre 3 valores");

        System.out.println("Digite o primeiro valor: ");
        media += sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        media += sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        media += sc.nextDouble();

        media = media / 3;

        System.out.println("A média dos 3 valores é: " + media);
    }
}
