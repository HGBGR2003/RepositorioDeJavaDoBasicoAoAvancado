package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex8 {
    public static void main(String[] args) {
        int numeros[];
        int numeroLimite = 5;
        double soma = 0;
        double media = 0;

        for (int i = 0; i < numeroLimite; i++){
            numeros = new int[numeroLimite];
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
            System.out.println(numeros[i]);

            System.out.println("----------------------------");

             soma += numeros[i];
             media = (soma / 5);
        }

        System.out.println("A soma é " + soma);
        System.out.println("-------------------------------");
        System.out.println("A média é " + media);
    }
}
