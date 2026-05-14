package aula9;

public class Matriz_Para_Vetor {
//Crie um matriz e copie os elementos da matriz paara um vetor
    public static void main(String[] args) {

        int matriz [] [] = { //Inicialização da matriz
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int linhas = matriz.length; //Puxa somente nº linhas (3)
        int colunas = matriz[0].length; //Puxa somente nº colunas (3)

        int[] vetor = new int [linhas * colunas]; //Iniciallização do vetor 
                                                    //Linhas (3) * Colunas (3), assim o vetor precisa de exatamente 9 posições

        int indice = 0; //Indice 0 é a atual posição do vetor

        System.out.println("Vetor que copiou os elementos da matriz");

        for(int i = 0; i < linhas; i ++) {
            for (int j = 0; j < colunas; j ++) {
                vetor [indice] = matriz [i][j]; //Vetor inicia do indice zerado
                indice ++; //Para puxar um elemento a cada loop
            }
        }

        System.out.println("Vetor: ");

        for (int i = 0; i < vetor.length; i ++) { //Para imprimir os vetores
            System.out.println(vetor[i] + " ");
        }
    }
}