package aula5;

public class Num_Impar {
    // Faça um algoritmo que percorra os números de 2 a 19, e se o número for ímpar, mostre-o.

    public static void main(String[] args) {
       
       int comeco = 2;
       int termino = 19;
       
       System.out.println("Exibição dos ímpares de 2 a 19:");

        for(int cont = comeco; cont <= termino; cont++) {
            if(cont % 2 != 0) {
                System.out.println("O valor " + cont + " é ímpar.");
            }
        }
    }
}
