package aula8;

import java.util.Scanner;

public class Nome_Vetor {
//Crie um algoritmo que solicite que o usuário insire 10 nomes e armazene esses números em um vetor
//Depois exiba aos nomes na ordem inversa

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] vetor = new String [10];

        System.out.println("Exibição de nomes, em ordem inversa.");

            for (int i = 0; i < 10; i ++) {
                System.out.println("Digite o nome da " + (i + 1) + " pessoa");
                vetor [i] = sc.nextLine();
            }

            System.out.println("O nome na ordem inversa é: ");
            for(int i = 9; i >= 0; i --) {
                System.out.println("O nome é: " + vetor [i]);
            }
    }
}
