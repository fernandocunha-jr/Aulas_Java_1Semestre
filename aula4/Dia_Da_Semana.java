package aula4;

import java.util.Scanner;

public class Dia_Da_Semana {
    // Faça um algoritmo para determinar o dia da semana com base em um número de 1 a 7.
    //Utilize switch case para resolver o problema.
    // 1: Domingo, 2: Segunda-feira, 3: Terça-feira, 4: Quarta-feira, 5: Quinta-feira, 6: Sexta-feira, 7: Sábado
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o dia da semana com base em um número de 1 a 7");

        System.out.println("1: Domingo, 2: Segunda-feira, 3: Terça-feira, 4: Quarta-feira, 5: Quinta-feira, 6: Sexta-feira, 7: Sábado");

        System.out.println("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> {
                System.out.println("O dia é domingo.");
                break;
            }

            case 2 -> {
                System.out.println("O dia é segunda-feira.");
                break;
            }

            case 3 -> {
                System.out.println("O dia é terça-feira.");
                break;
            }

            case 4 -> {
                System.out.println("O dia é quarta-feira.");
                break;
            }

            case 5 -> {
                System.out.println("O dia é quinta-feira.");
                break;
            }

            case 6 -> {
                System.out.println("O dia é sexta-feira.");
                break;
            }

            case 7 -> {
                System.out.println("O dia é sábado.");
                break;
            }

            default -> {
                System.out.println("Número inválido. Digite um número de 1 a 7.");
            }
        }
    }
}
