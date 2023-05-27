package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Continuacao20 {
    public static void truncar(double valor){
        DecimalFormat df = new DecimalFormat("#,#0.0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Sua nota foi de " + df.format(valor));
        System.out.println("------------------------------------");
    }

}
