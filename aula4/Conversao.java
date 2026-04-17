package aula4;

import java.util.Scanner;

public class Conversao {
    // Faça um algoritmo para converter um valor dado pelo usuário (metros, centímetros, quilômetros) e converte-lo para uma unidade especificada.
    //Utilize switch case para resolver o problema.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de unidades de medida");

        System.out.println("Escolha a unidade: ");
        System.out.println("1 - Metros");
        System.out.println("2 - Quilômetros");
        System.out.println("3 - Centímetros");

        int opcao = sc.nextInt();

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        switch (opcao) {
            case 1 -> {
                System.out.println("Valor em metros: " + valor);
                System.out.println("Valor em quilômetros: " + valor / 1000);
                System.out.println("Valor em centímetros: " + valor * 100);
                break;
            }

            case 2 -> {
                System.out.println("Valor em metros: " + valor * 1000);
                System.out.println("Valor em quilômetros: " + valor);
                System.out.println("Valor em centímetros: " + valor * 100000);
                break;
            }

            case 3 -> {
                System.out.println("Valor em metros: " + valor / 100);
                System.out.println("Valor em quilômetros: " + valor / 100000);
                System.out.println("Valor em centímetros: " + valor);
                break;
            }

            default -> {
                System.out.println("Opção inválida.");
            }
        }
    }
}
