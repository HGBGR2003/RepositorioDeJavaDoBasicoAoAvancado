package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);
        int casasDecimais = 2;

        System.out.println("Informe o valor do raio ?");
        double medidaRaio = impressora.nextDouble();

        System.out.println("----------------------------");

        double resultadoRaio = Math.PI * Math.pow(medidaRaio,2);

        BigDecimal bd = new BigDecimal(resultadoRaio);
        bd = bd.setScale(casasDecimais,BigDecimal.ROUND_DOWN);
        double valorTruncado = bd.doubleValue();

        System.out.println("O resultado da area do circulo " + valorTruncado);


    }
}
