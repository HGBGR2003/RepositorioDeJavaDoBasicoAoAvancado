package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe7 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];
        int valorUsuarioA;

        for (int i = 0; i < vetorA.length; i++){
            valorUsuarioA = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor A"));
            int valorUsuarioB = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor B"));

            vetorA[i] = valorUsuarioA;
            vetorB[i] = valorUsuarioB;

            vetorC[i] = vetorA[i] - vetorB[i];

            System.out.println("A subtração do vetor C: " + vetorC[i]);


        }
    }
}
