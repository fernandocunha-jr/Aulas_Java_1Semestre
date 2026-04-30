package aula6;

import java.util.Scanner;

public class Hexa_Deci {
    //Faça um algoritmo que pede para o usuário digitar um número hexadecimal.
    //O algoritmo deve converter o número hexadecimal para decimal e mostrar o resultado.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hex;
        int decimal = 0;

        System.out.println("Digite um número hexadecimal:");
        hex = sc.nextLine().toUpperCase();// Lê o número hexadecimal digitado pelo usuário e converte para maiúsculas para facilitar a comparação.

        for(int i = 0; i < hex.length(); i++) {
            String digito = hex.substring(i, i + 1); // Extrai o dígito hexadecimal da posição i.

            int valor = 0; // Variável para armazenar o valor decimal correspondente ao dígito hexadecimal.

            if (digito.equals("0")) valor = 0;
            else if (digito.equals("1")) valor = 1;
            else if (digito.equals("2")) valor = 2;
            else if (digito.equals("3")) valor = 3;
            else if (digito.equals("4")) valor = 4;
            else if (digito.equals("5")) valor = 5;
            else if (digito.equals("6")) valor = 6;
            else if (digito.equals("7")) valor = 7;
            else if (digito.equals("8")) valor = 8;
            else if (digito.equals("9")) valor = 9;
            else if (digito.equals("A")) valor = 10;
            else if (digito.equals("B")) valor = 11;
            else if (digito.equals("C")) valor = 12;
            else if (digito.equals("D")) valor = 13;
            else if (digito.equals("E")) valor = 14;
            else if (digito.equals("F")) valor = 15;

            decimal = decimal * 16 + valor; // Converte o dígito hexadecimal para decimal e acumula o resultado.
        }

        System.out.println("O número decimal é: " + decimal);
    }
}