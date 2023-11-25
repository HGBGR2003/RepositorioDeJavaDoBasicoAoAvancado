package aluno.henrique.exerciciosdecasa.lista.aula17.ex13;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        int numeroBase;
        int numeroExpoente;
        double resultado = 0;
        CalculoPotencia cp = new CalculoPotencia();

        Scanner scn = new Scanner(System.in);

        System.out.println("Informe o numero da base:");
        numeroBase = scn.nextInt();

        System.out.println("Informe o numero do expoente:");
        numeroExpoente = scn.nextInt();

        resultado = cp.calcularPotencia(numeroExpoente, numeroBase);
        System.out.println("O resultado da base " + numeroBase + " é igual " + resultado);


    }
}
