package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex18 {
    public static void main(String[] args) {
        double tamanhoMb;
        tamanhoMb = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho de arquivo para download ?"));
        double velocidadeLink = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho" +
                " do link para download ?"));

        double tempoAproximado = tamanhoMb / velocidadeLink;

        System.out.println("O tempo é " + tempoAproximado + " s");

    }
}
