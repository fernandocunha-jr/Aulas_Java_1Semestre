package aula5;

public class Tabuada {
    // Faça um algoritmo que imprima a tabuada completa de 1 a 10.
    public static void main(String[] args) {

        for(int num = 1; num <= 10; num++) {
            for(int cont = 1; cont <= 10; cont++) { // cont = 1: comecar a tabuada do 1, cont <= 10: termina a tabuada até o 10.
                                                // cont++: faz adicionar +1 a cada repetição do loop.
            System.out.println(num + " x " + cont + " = " + (num * cont));
            }
        }
    }
}