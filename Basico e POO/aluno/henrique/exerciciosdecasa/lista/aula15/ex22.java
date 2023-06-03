package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        int numero;
        Scanner sfc = new Scanner(System.in);

        System.out.println("Informe um número:");
        numero = sfc.nextInt();

        if (numero % 2 == 0){
            System.out.println("É PAR");
        }else{
            System.out.println("É IMPAR");
        }



    }
}
