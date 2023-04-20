package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        double metrosQuadradosUsuario;
        Scanner sc = new Scanner(System.in);
        double quantidadeTintas;

        System.out.println("Informe o tamanho em metros quadrados?");
        metrosQuadradosUsuario = sc.nextDouble();

        System.out.println("----------------------------------------");

        quantidadeTintas = metrosQuadradosUsuario / 54;
        BigDecimal valorDecimal = new BigDecimal(quantidadeTintas);
        valorDecimal = valorDecimal.setScale(2, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        double valorLata = quantidadeTintas * 80.00;
        BigDecimal valordecimal = new BigDecimal(valorLata);
        valordecimal = valordecimal.setScale(2, RoundingMode.HALF_UP);
        double valorLata2 = valordecimal.doubleValue();

        System.out.println("A quantidade de tintas é " + valorFormula);
        System.out.println("----------------------------------------");
        System.out.println("Resultado é R$ " + valorLata2);

    }
}
