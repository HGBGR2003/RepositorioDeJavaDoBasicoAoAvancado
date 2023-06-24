package aluno.henrique.exerciciosdecasa.lista.aula15.Exercicio20;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MensagemNotas {
    public static void truncar(double valor){
        DecimalFormat df = new DecimalFormat("#,#0.0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Sua nota foi de " + df.format(valor));
        System.out.println("------------------------------------");
    }

}
