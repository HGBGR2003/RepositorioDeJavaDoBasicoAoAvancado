package aluno.henrique.exerciciosdecasa.lista.aula15;


import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int numeral = imprimir.nextInt();

        if (numeral %2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

    }
}
