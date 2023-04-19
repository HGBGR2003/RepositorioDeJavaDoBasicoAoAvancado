package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        double numeroReal;
        int numero1;
        int numero2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe o primeiro inteiro ?");
        numero1 = scn.nextInt();

        System.out.println("Informe o segundo inteiro ?");
        numero2 = scn.nextInt();

        System.out.println("Informe um número real com virgula.");
        numeroReal = scn.nextDouble();

        System.out.println("---------------------------------");

        //Letra A

        double multiplicidade;
        multiplicidade = (numero1 * 2) * ((double) numero2 / 2);
        System.out.println("O resultado é " +  multiplicidade);

        System.out.println("---------------------------------");

        //Letra B
        double triploSoma;
        triploSoma = (numero1 * 3) + ((double) numeroReal);
        System.out.println("O resultado é " + triploSoma);

        System.out.println("---------------------------------");

        //Letra C
        double elevadoCubo = Math.pow(numeroReal, 3);
        BigDecimal valorDecimal = new BigDecimal(elevadoCubo);
        valorDecimal = valorDecimal.setScale(2, RoundingMode.HALF_UP);
        double novoValor = valorDecimal.doubleValue();
        System.out.println("O cubo desse resultado é " + novoValor);


    }
}
