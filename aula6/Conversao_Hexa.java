package aula6;

import java.util.Scanner;

public class Conversao_Hexa {
    //Faça um algoritmo que pede para o usuário digitar um número hexadecimal.
    //O algoritmo deve converter o número hexadecimal para decimal e mostrar o resultado.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hex; // Variável para armazenar o número hexadecimal digitado pelo usuário.
        int decimal = 0;

        System.out.println("Digite um número hexadecimal:");
        hex = sc.nextLine().toUpperCase();// Lê o número hexadecimal digitado pelo usuário e converte para maiúsculas para facilitar a comparação.

        for(int i = 0; i < hex.length(); i++) {
            String digito = hex.substring(i, i + 1); //Extrai o digito hexadecimal da posição i usando o método substring.
                                    //+1 porque o substring pega o caractere da posição i até a posição i+1, ou seja, apenas um caractere.

            int valor;// Variável para armazenar o valor decimal correspondente ao dígito hexadecimal.

            switch (digito) {
                case "0" -> {
                     valor = 0;
                     break;
                }
                case "1" -> {
                    valor = 1;
                    break;
                }
                case "2" -> {
                    valor = 2;
                    break;
                }
                case "3" -> {
                    valor = 3;
                    break;
                }
                case "4" -> {
                    valor = 4;
                    break;
                }
                case "5" -> {
                    valor = 5;
                    break;
                }
                case "6" -> {
                    valor = 6;
                    break;
                }
                case "7" -> {
                    valor = 7;
                    break;
                }
                case "8" -> {
                    valor = 8;
                    break;
                }
                case "9" -> {
                    valor = 9;
                    break;
                }
                case "A" -> {
                    valor = 10;
                    break;
                }
                case "B" -> {
                    valor = 11;
                    break;
                }
                case "C" -> {
                    valor = 12;
                    break;
                }
                case "D" -> {
                    valor = 13;
                    break;
                }
                case "E" -> {
                    valor = 14;
                    break;
                }
                case "F" -> {
                    valor = 15;
                    break;
                }
                default -> {
                    System.out.println("Dígito hexadecimal inválido!");
                    return;
                }
            }

            decimal = decimal * 16 + valor; // Converte o dígito hexadecimal para decimal e acumula o resultado.
        }

        System.out.println("O número decimal é: " + decimal);
    }
}