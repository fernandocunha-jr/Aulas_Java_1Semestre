package aula10;

import java.util.Scanner;

public class Funcao_3Media {
//Crie uma função que receba três números e retorne a média deles

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Calcula a média de três números inteiros");    

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        exibirMensagem(num1, num2, num3);

        sc.close();
    }

    public static void exibirMensagem(int num1, int num2, int num3) {
        System.out.println("A média dos números digitados é: " + (num1 + num2 + num3) / 3);
    }
}


