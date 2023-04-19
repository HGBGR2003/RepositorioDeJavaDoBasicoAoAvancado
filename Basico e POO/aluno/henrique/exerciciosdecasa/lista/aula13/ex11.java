package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.text.DecimalFormat;
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

        //Letra A
        /*
        double multiplicidade;
        multiplicidade = (numero1 * 2) * ((double) numero2 / 2);
        System.out.println("O resultado é " +  multiplicidade);*/

        //Letra B
        /*
        double triploSoma;
        triploSoma = (numero1 * 3) + ((double) numeroReal);
        System.out.println("O resultado é " + triploSoma);*/

        //Letra C
        double elevadoCubo = Math.pow(numeroReal,3);
        DecimalFormat df = new DecimalFormat("#.##");
        double novoValor = Double.parseDouble(df.format(elevadoCubo));
        System.out.println("O cubo desse resultado é " + novoValor);

    }
}
