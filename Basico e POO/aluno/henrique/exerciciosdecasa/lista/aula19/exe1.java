package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe1 {
    public static void main(String[] args) {
        int [] vetorA = new int[5];
        int [] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            int usuarioVetor = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
            vetorA[i] = usuarioVetor;
            vetorB [i] = vetorA[i];
            System.out.println( "Vetor A: " + vetorA[i] + " ---- " + " Vetor B: " + vetorB[i]);

        }


    }
}
