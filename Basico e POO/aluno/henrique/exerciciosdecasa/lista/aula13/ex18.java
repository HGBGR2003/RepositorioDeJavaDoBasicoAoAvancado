package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex18 {
    public static void main(String[] args) {
        double tamanhoMb;
        tamanhoMb = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho de arquivo para download ?"));
        double velocidadeLink = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade" +
                " da internet ?"));

        double tempo = tamanhoMb / velocidadeLink;

        System.out.println("O tempo aproximado de download é " + tempo + " minutos");

    }
}
