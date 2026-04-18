package aula5;

import java.util.Scanner;

public class Num_Div7 {
/*Faça um algoritmo que quais números são divisiveis por 7, em uma range informado pelo
usuário até que o primeiro divisivel apareça. A condição de parada é atingir o range ou
achar um número divisivel por 7.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
       int comeco;
       int termino;
       
        System.out.println("Digite o valor do primeiro range.");
        comeco = sc.nextInt();
        
        System.out.println("Digite o valor do segundo range.");
        termino = sc.nextInt();
        
        for(int cont = comeco; cont <= termino; cont++)
            if(cont % 7 > 0) {
                System.out.println("O valor " + cont + " não é divisivel por 7.");
            }else {
                System.out.println("O valor " + cont + " é o primeiro divisivel de 7.");
                break;
            }
    }
}

