package aula4;

import java.util.Scanner;

public class Mes_Do_Ano {
    // Faça um algoritmo para determinar o mês do ano com base em um número de 1 a 12.
    //Utilize switch case para resolver o problema.
    // 1: Janeiro, 2: Fevereiro, 3: Março, 4: Abril, 5: Maio, 6: Junho, 7: Julho, 8: Agosto, 9: Setembro, 10: Outubro, 11: Novembro, 12: Dezembro
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o mês do ano com base em um número de 1 a 12");

        System.out.println("1: Janeiro, 2: Fevereiro, 3: Março, 4: Abril, 5: Maio, 6: Junho");
        System.out.println("7: Julho, 8: Agosto, 9: Setembro, 10: Outubro, 11: Novembro, 12: Dezembro");

        System.out.println("Digite um número de 1 a 12: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1 -> {
                System.out.println("O mês é Janeiro.");
                break;
            }

            case 2 -> {
                System.out.println("O mês é Fevereiro.");
                break;
            }

            case 3 -> {
                System.out.println("O mês é Março.");
                break;
            }

            case 4 -> {
                System.out.println("O mês é Abril.");
                break;
            }

            case 5 -> {
                System.out.println("O mês é Maio.");
                break;
            }

            case 6 -> {
                System.out.println("O mês é Junho.");
                break;
            }

            case 7 -> {
                System.out.println("O mês é Julho.");
                break;
            }

            case 8 -> {
                System.out.println("O mês é Agosto.");
                break;
            }

            case 9 -> {
                System.out.println("O mês é Setembro.");
                break;
            }

            case 10 -> {
                System.out.println("O mês é Outubro.");
                break;
            }

            case 11 -> {
                System.out.println("O mês é Novembro.");
                break;
            }

            case 12 -> {
                System.out.println("O mês é Dezembro.");
                break;
            }

            default -> {
                System.out.println("Número inválido. Digite um número de 1 a 12.");
            }
        }
    }
}
