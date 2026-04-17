package aula3;

import java.util.Scanner;

public class Fase_Da_Vida {
    // Faça um algoritmo para determinar a fase da vida de uma pessoa, a partir do seu ano de nascimento. Considere as seguintes faixas:
    // 0 a 10 anos: Criança
    // 11 a 18 anos: Adolescente
    // 19 a 59 anos: Adulto
    // 60 anos ou mais: Idoso

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoNascimento;
        int anoAtual = 2026;

        System.out.println("Determine sua fase da vida");

        System.out.println("Digite o seu ano de nascimento: ");
        anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 0 && idade <= 10) {
            System.out.println("Você é uma criança.");

        } else if (idade >= 11 && idade <= 18) {
            System.out.println("Você é um adolescente.");

        } else if (idade >= 19 && idade <= 59) {
            System.out.println("Você é um adulto.");

        } else if (idade >= 60 && idade <= 120) {
            System.out.println("Você é um idoso.");

        } else {
            System.out.println("Ano de nascimento inválido.");
        }
    }

}
