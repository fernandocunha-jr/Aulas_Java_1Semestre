package aula10;

import java.util.Scanner;

public class Funcao_Dobro {
//Crie uma função que receba um número e retorne o seu dobro

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Retorna o dobro de um número inteiro");
            
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            
            int resultado = dobro(numero);
            
            System.out.println("O dobro de " + numero + " é: " + resultado);
        }
    }

        public static int dobro(int numero) {
        return numero * 2;
    }
}

