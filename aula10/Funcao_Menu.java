package aula10;

import java.util.Scanner;

public class Funcao_Menu {
/*Escreva um programa que tenha uma função menu() para exibir
opções e outras funções para executar as ações de cada opção.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();
                    System.out.println("O dobro de " + numero + " é: " + dobro(numero));
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    exibirMensagem(nome, idade);
                    break;

                case 3:
                    System.out.print("Digite um número: ");
                    int num = sc.nextInt();
                    if (par(num)) {
                        System.out.println(num + " é par.");
                    } else {
                        System.out.println(num + " é ímpar.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1 - Calcular o dobro de um número");
        System.out.println("2 - Exibir mensagem com nome e idade");
        System.out.println("3 - Verificar se um número é par ou ímpar");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int dobro(int numero) {
        return numero * 2;
    }

    public static void exibirMensagem(String nome, int idade) {
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }
}