package aula5;

public class Tabuada {
    // Faça um algoritmo que imprima a tabuada completa de 1 a 10.
    public static void main(String[] args) {
        
        double resultado;

        for(int num = 1; num <= 10; num++) {
            for(int cont = 1; cont <= 10; cont++) { 
                resultado = num * cont; 
            System.out.println(num + " x " + cont + " = " + resultado);
            }
        }
    }
}