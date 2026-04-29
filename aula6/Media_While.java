package aula6;

import java.util.Scanner;

public class Media_While {
    //Faça um algoritmo que pede para o usuário digitar números. O algoritmo deve calcular a média dos números e mostrar o resultado.
    //Encerrar o programa quando o usuário digitar o número 0.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num = 1; // Inicializa a variável num com um valor diferente de 0 para entrar no loop.
        double soma = 0; // Variável para acumular a soma dos números digitados   
        int cont = 0; // Variável para contar a quantidade de números digitados
        double media; // Variável para armazenar a média dos números digitados  

        while (num != 0) { // O loop continua enquanto num for diferente de 0.

            System.out.println("Digite um número para calcular a média (ou 0 para encerrar):");
            num = sc.nextDouble(); // Lê o número digitado pelo usuário.
            
            soma += num; // Acumula o número digitado à soma total.
            cont++; // Incrementa a contagem de números digitados.
        }

        media = soma / (cont - 1); // Calcula a média dos números digitados. Subtrai 1 de cont para não incluir o número 0 na contagem.
        System.out.println("A média dos números digitados é: " + media); 
    }
}
