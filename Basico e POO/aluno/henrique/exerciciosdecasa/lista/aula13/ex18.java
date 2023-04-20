package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ex18 {
    public static void main(String[] args) {
        double tamanhoMb;
        tamanhoMb = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho de arquivo para download ?"));
        double velocidadeLink = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho" +
                " do link para download ?"));

        double velocidadeDownload = velocidadeLink / 8;

        double tempoAproximado = (tamanhoMb / velocidadeDownload) / 60;

        BigDecimal tempo = new BigDecimal(tempoAproximado);
        tempo = tempo.setScale(2, RoundingMode.HALF_UP);
        double tempoTruncadoEmDois = tempo.doubleValue();

        System.out.println("O tempo aproximado de download é " + tempoTruncadoEmDois + " minutos");

    }
}
