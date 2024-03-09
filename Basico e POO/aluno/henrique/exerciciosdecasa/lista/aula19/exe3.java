package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe3 {
    public static void main(String[] args) {
        double [] vetor1 = new double[15];
        double [] vetor2 = new double[15];
        double respostasUsuario;
        double entradasDeValores;

        for (int i = 0; i < vetor1.length; i++){
            entradasDeValores = Integer.parseInt(JOptionPane.showInputDialog(" Entre com um valor inteiro: "));
            vetor1[i] = entradasDeValores;
            respostasUsuario = Math.pow(vetor1[i], 2); // <- Elevar o número ao quadrado.
            vetor2[i] = respostasUsuario;

            System.out.println( " O valor do vetor A ao quadrado é : " + vetor1[i] +  " - Resposta: " + vetor2[i]);
        }

    }
}
