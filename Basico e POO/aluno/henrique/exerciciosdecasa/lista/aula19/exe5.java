package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe5 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int entradasDeValores;

        for (int i = 0; i < vetorA.length; i++){
            entradasDeValores = Integer.parseInt(JOptionPane.showInputDialog(" Entre com um valor inteiro: "));
            vetorA[i] = entradasDeValores;
            vetorB[i] = vetorA[i] * i;
            System.out.println( " O valor do vetor B, que é resposta do vetor A multiplicado com o indice é:  "  + vetorB[i]);
        }

    }
}
