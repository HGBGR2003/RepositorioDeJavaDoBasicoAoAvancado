package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe8 {
    public static void main(String[] args) {
        int[] vetorA = new int[4];
        int[] vetorB = new int[4];
        int[] vetorC = new int[4];
        int valorUsuA;
        int valorUsuB;

        for (int i = 0; i < vetorA.length; i++){
            valorUsuA = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor A"));
            valorUsuB = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor B"));

            vetorA[i] = valorUsuA;
            vetorB[i] = valorUsuB;

            vetorC[i] = vetorA[i] * vetorB[i];

            System.out.println("O resultado da multiplicação: " + vetorC[i]);

        }

    }
}
