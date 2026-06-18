package aula10;

import java.util.Scanner;

public class Funcao_Nome_Idade {
//Crie uma função que receba o nome e a idade de uma pessoa e exiba uma mensagem

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Exibe o nome e a idade de uma pessoa");
            
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            
            exibirMensagem(nome, idade);
        }
    }

    public static void exibirMensagem(String nome, int idade) {
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}


