package aula9;

public class Matriz_0a99 {
//Crie um programa que gere uma matriz 10 x 10 contendo números de 0 a 99


    public static void main(String[] args) {

        int matriz [] [] = new int [10] [10];
        int numero = 0;

        System.out.println("Exibição de uma matriz 10x10, do 0 ao 99");

        //Preenchendo a matriz
        for(int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                matriz [i][j] = numero++; //Insere o valor atual e já incrementa para o próximo
            }
        }

        //Exibir a matriz
        for(int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                System.out.println(matriz [i][j]);
            }
        }

        System.out.println(); //Para pular linha na matriz

    }
}
