package aula10;

import java.util.Scanner;

public class Funcao_Par_True {
//Crie uma função que receba um número e retorne true se ele for par, e false caso contrário.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Verifica se um número é par ou ímpar");

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (par(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        sc.close();
    }

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }
}

