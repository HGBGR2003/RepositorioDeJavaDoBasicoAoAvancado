package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe6 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];
        int valorUsuario;

        for (int i = 0; i < vetorA.length; i++){
            valorUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor A"));
            int valorUsuarioB = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: Vetor B"));
            vetorA[i] = valorUsuario;
            vetorB[i] = valorUsuarioB;

            vetorC[i] = vetorA[i] + vetorB[i];

            System.out.println("O valor da soma do Vetor C: " + vetorC[i]);


        }

    }
}
