package aula9;

public class Desenho_Matriz {
//Crie um desenho em matriz utilizando caracteres (X e espaço)

    public static void main(String[] args) {

        int meio = 5;

        System.out.println("Losango em X");

        for (int i = 1; i <= meio; i++) {
            for(int s = 0; s < meio -i; s ++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j ++) System.out.print("X");
            System.out.println();
        }

        for (int i = meio - 1; i >= 1; i--) {
            for(int s = 0; s < meio -i; s ++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j ++) System.out.print("X");
            System.out.println();
        }  
    }
}