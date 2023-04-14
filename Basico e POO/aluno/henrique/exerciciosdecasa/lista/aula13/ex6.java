package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);
        final double numeroPi = 3.14;
        int casasDecimais = 2;

        System.out.println("Informe o valor do raio");
        double medidaRaio = impressora.nextDouble();

        double resultadoRaio = numeroPi * medidaRaio * medidaRaio;

        BigDecimal bd = new BigDecimal(resultadoRaio);
        bd = bd.setScale(casasDecimais,BigDecimal.ROUND_DOWN);
        double valorTruncado = bd.doubleValue();

        System.out.println("O resultado da area do circulo " + resultadoRaio);


    }
}
