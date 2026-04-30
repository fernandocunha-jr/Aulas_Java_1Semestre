package aula6;

import java.util.Scanner;

public class Maquina_de_Venda {
    //Faça um algoritmo que simula uma máquina de venda automatica. O usuário deve fonecer o valor do produto desejado.
    //Inserir o valor do pagamento até que o pagamento seja suficiente para comprar o produto.
    // O algoritmo deve mostrar o troco a ser devolvido ao usuário.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produto = {"Pastel", "Salgado", "Caldo de Cana", "Suco Natural", "Refrigerante"};
        double[] precos = {12.0, 10.50, 7.0, 7.50, 6.0}; // [] -> indica que é um array, ou seja, uma coleção de elementos do mesmo tipo.
        int opcao; // Variável para armazenar a opção escolhida pelo usuário.
        double valorProduto; // Variável para armazenar o valor do produto escolhido pelo usuário.
        double valorPago; // Variável para acumular o valor pago pelo usuário.
        double troco; // Variável para armazenar o valor do troco a ser devolvido ao usuário.

        System.out.println("Escolha um produto:");
        for (int i = 0; i < produto.length; i++) { //lenght = comprimento do array, a quantidade de elementos.
                                                // Loop para exibir os produtos e seus preços.
                                                // O loop continua enquanto i for menor que o comprimento do array produto.
            System.out.println(i + " - " + produto[i] + " | R$ " + precos[i]);
        }
        opcao = sc.nextInt(); //Escolha do produto.

        valorProduto = precos[opcao]; // Acessa o preço do produto escolhido pelo usuário usando a opção como índice do array precos.
        valorPago = 0; // Inicializa o valor pago com 0 para começar a acumular os pagamentos do usuário.

        while (valorPago < valorProduto) { // O loop continua enquanto o valor pago for menor que o valor do produto.
            System.out.println("Digite o valor do pagamento:");
            valorPago += sc.nextDouble(); // Acumula o valor pago pelo usuário.
        }

        troco = valorPago - valorProduto;
        System.out.println("Produto escolhido: " + produto[opcao]); // Exibe o nome do produto escolhido pelo usuário.
        System.out.println("O troco a ser devolvido é: R$ " + troco); //Calcula e exibe o troco a ser devolvido ao usuário.
    }
}