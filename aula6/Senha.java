package aula6;

import java.util.Scanner;

public class Senha {
    //Faça um algoritmo que pede para o usuário digitar uma senha e continua pedindo para o usuário digitar até que a senha seja digitada.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senha = "AmauriLindo123@";
        String senhaDigitada;

        do {
            System.out.println("Digite a senha:");
            senhaDigitada = sc.nextLine(); // Lê a senha digitada pelo usuário.

            if (!senhaDigitada.equals(senha)) { // Equals: compara o conteúdo da string.
                                                //!senhaDigitada -> se a senha digitada for diferente da senha correta.
                System.out.println("Senha incorreta! Tente novamente.");
            }

        } while (!senhaDigitada.equals(senha)); // O loop continua enquanto a senha estiver errada.

        System.out.println("Senha correta!"); //Se estiver correta acaba o Loop e imprime a mensagem de senha correta.
    }
}
