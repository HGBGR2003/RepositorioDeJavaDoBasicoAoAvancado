package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);
        int casasDecimais = 1;

        System.out.println("Informe a primeira nota:");
        double notaPrimeira = impressora.nextDouble();

        System.out.println("-------------");

        System.out.println("Informe a segunda nota:");
        double notaSegunda = impressora.nextDouble();

        System.out.println("-------------");

        System.out.println("Informe a terceira nota:");
        double notaTerceira = impressora.nextDouble();

        System.out.println("-------------");

        System.out.println("Informe a quarta nota:");
        double notaQuarta = impressora.nextDouble();

        double mediaDasNotasBimestrais = (notaPrimeira + notaSegunda + notaTerceira + notaQuarta) / 4;

        BigDecimal bd = new BigDecimal(mediaDasNotasBimestrais);
        bd = bd.setScale(casasDecimais,BigDecimal.ROUND_DOWN);
        double valorTruncado = bd.doubleValue();

        System.out.println("-------------");
        System.out.println("A média das notas é " + valorTruncado);


    }
}
