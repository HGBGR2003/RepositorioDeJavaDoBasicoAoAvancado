package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int valor1;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe um valor:");
        valor1 = impressora.nextInt();

        System.out.println("------------------------");

        if (valor1 >= 0){
            System.out.println("O número informado é POSITIVO");
        }else{
            System.out.println("O número informado é NEGATIVO");
        }

    }
}
