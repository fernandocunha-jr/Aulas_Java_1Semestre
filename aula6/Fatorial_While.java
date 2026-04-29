package aula6;

import java.util.Scanner;

public class Fatorial_While {
    // Faça um algoritmo que calcule o fatorial de um número informado pelo usuário.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int fatorial = 1;  // =1 porque o fatorial de 0 é 1 e qualquer número multiplicado por 0 é 0. então se inicia com 1.
        int cont = 1; // = 1 porque o fatorial de 0 é 1, e qualquer número multiplicado por 0 é 0. então se inicia com 1.
                
        System.out.println("Digite um número para calcular o fatorial:");
        num = sc.nextInt();

        while (cont <= num) { // Enquanto o contador for menor ou igual ao número informado pelo usuário, o loop continua executando.
            fatorial *= cont; // *= é o operador de atribuição, multiplica o valor da variável cont com a variável fatorial;
            cont++; // Incrementa o contador para evitar um loop infinito e para calcular o fatorial corretamente.
                    // O contador é incrementado em 1 a cada iteração do loop.
        }
        
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
