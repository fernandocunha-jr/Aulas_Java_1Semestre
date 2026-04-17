package aula3;

import java.util.Scanner;

public class Ano_Bissexto {
    // Faça um algoritmo para determinar se um ano é bissexto.
    // Utilize estrutura de decisão para resolver o problema.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.println("Determine se um ano é bissexto");

        System.out.println("Digite um ano: ");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
 // % 4 == 0 -> O ano é divisível por 4 && (e) % 100 != 0 -> O ano não é divisível por 100 || (ou) % 400 == 0 -> O ano é divisível por 400
            System.out.println("O ano é bissexto.");

        } else {
            System.out.println("O ano não é bissexto.");
        }

    }

}
