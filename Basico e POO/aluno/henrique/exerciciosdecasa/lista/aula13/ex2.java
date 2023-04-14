package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe um número usuário?");
        int numeroDigitado = impressora.nextInt();

        System.out.println("O número informado pelo usuário foi " + numeroDigitado);

    }
}
