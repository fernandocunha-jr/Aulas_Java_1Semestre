package aula9;

public class Matriz_Indices {
//Crie um matriz onde cada elemento seja a soma dos índices
    public static void main(String[] args) {

        int linhas = 5; //Determina nº de linhas
        int colunas = 5; //Determina nº de colunas

        int matriz [] [] = new int [linhas] [colunas];

        System.out.println("Matriz aonde a soma dos índices são os elementos");

        for(int i = 0; i < linhas; i ++) {
            for (int j = 0; j < colunas; j ++) {
                matriz[i][j] = i + j; //Faz com que percora de 1 por 1 sempre acrescentando a soma dos índices [i] e [j]
                                        //Exemplo [0] + [0] = 0 -> Linha 0 e Coluna 0, resultado 0
            }
        }

        for(int i = 0; i < linhas; i ++) {
            for (int j = 0; j < colunas; j ++) {
                System.out.println(matriz [i][j]); //Para exibir toda matriz
            }
        }

        System.out.println();
    }
}