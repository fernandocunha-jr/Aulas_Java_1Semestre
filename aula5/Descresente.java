package aula5;

public class Descresente {
    // Faça um algoritmo que imprima os números de 10 a 0 em ordem decrescente.

    public static void main(String[] args) {

         int inicio = 10;
         int fim = 0;

        System.out.println("Exibição dos números de 10 a 0 em ordem decrescente:");
       

        for(int cont = inicio; cont >= fim; cont--) {
            System.out.println(cont);
        }
    }
}
