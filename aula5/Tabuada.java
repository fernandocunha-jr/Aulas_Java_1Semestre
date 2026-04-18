package aula5;

import java.util.Scanner;

public class Tabuada {
    // Faça um algoritmo que imprima a tabuada de um número informado pelo usuário de 1 a 10.

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num;

            System.out.println("Digite um número para exibir a tabuada de 1 a 10:");
            num = sc.nextInt();

        for(int cont = 1; cont <= 10; cont++) { // cont = 1: comecar a tabuada do 1, cont <= 10: termina a tabuada até o 10.
                                                // cont++: faz adicionar +1 a cada repetição do loop.
            System.out.println(num + " x " + cont + " = " + (num * cont));
        }
    }
}