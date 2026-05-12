package aula7;

import java.util.Scanner;

public class BitWase {
//Exemplo de utilização de bitwase
//Verificar um bit usando AND (&), saber se a sexta posição do bit é 1 ou 0
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Verifique a sexta posição bit de um número");

        System.out.println("Digite um número inteiro para verificação: " );
        int n = sc.nextInt();
        int mascara = 32; //32 pois em bit é 100000 (1 na sexta posição), então serve para verificar apenas a sexta posição

        if ((n & mascara) != 0){ //se a sexta posição de n for 1 e a sexta posição da mascara é 1 então resultado != de 0
                                    //1|1 = 1, 1|0 = 0, 0|0 = 0
            System.out.println("O sexto bit vale 1");
        } else {
            System.out.println("O sexto bit vale 0");
        }
    }
}