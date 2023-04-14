package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe o primeiro número :");
        int primeiroNumero = impressora.nextInt();

        System.out.println("-------------");

        System.out.println("Informe o segundo número :");
        int segundoNumero = impressora.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.println("-------------");

        System.out.println("A soma dos números é " + soma);


    }
}
