package aula9;

import java.util.Scanner;

public class Matriz_5x5 {
//Crie um matriz 5x5 aonde o usuário pode inserir os números
//Após exiba a matiz na tela
//Calcule a soma da diagonal principal
//Permita que o usuário informe uma linha e coluna e exiba o valor correspondente
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz [] [] = new int [5] [5];

        //Criação da Matriz 5x5
        System.out.println("Preenchimento da Matriz 5x5");
        for(int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++) {
                System.out.println("Informe o valor da linha " + (i+1) + " e da coluna " + (j+1));
                matriz[i][j] = sc.nextInt();
            }
        }

        //Exibição da Matriz
        System.out.println("Matriz 5x5");
        for(int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++) {
                System.out.println(matriz [i][j]);
            }
            System.out.println();
        }

        //Soma da diagonal principal
        int somaDiagonal = 0;

        System.out.println("Diagonal Principal");

        for(int i = 0; i < 5; i ++) {
            somaDiagonal += matriz [i][i]; //Linha e coluna sempre iguais
        }

        System.out.println("A soma da diagonal principal é " + somaDiagonal);

        //Consulta de elemento por linha e coluna
        int linha;
        int coluna;

        System.out.println("Consulta de elemento");

        System.out.println("Informe a linha (1 a 5): ");
        linha = sc.nextInt();
        System.out.println("Informe a coluna (1 a 5): ");
        coluna = sc.nextInt();

        if (linha >= 1 && linha <= 5 && coluna >= 1 && coluna <= 5) {
            System.out.println("O valor na posição " + "|" + linha + "|" + coluna + "|" + " é " + matriz[linha - 1] [coluna - 1]);
        } else {
            System.out.println("Linha ou coluna inválida. Informe valores entre 1 e 5");
        }
        sc.close();
    }
}