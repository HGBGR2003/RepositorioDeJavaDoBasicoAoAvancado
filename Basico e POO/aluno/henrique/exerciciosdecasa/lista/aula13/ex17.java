package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        double metrosQuadradosUsuario;
        Scanner sc = new Scanner(System.in);
        double quantidadeTintas;
        double valorLata;

        System.out.println("Informe o tamanho em metros quadrados?");
        metrosQuadradosUsuario = sc.nextDouble();

        System.out.println("----------------------------------------");

        //Letra A
        /*
        quantidadeTintas = metrosQuadradosUsuario / 108;
        BigDecimal valorDecimal = new BigDecimal(quantidadeTintas);
        valorDecimal = valorDecimal.setScale(2, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        double valorLata = quantidadeTintas * 80.00;
        BigDecimal valordecimal = new BigDecimal(valorLata);
        valordecimal = valordecimal.setScale(2, RoundingMode.HALF_UP);
        double valorLata2 = valordecimal.doubleValue();

        System.out.println("A quantidade de tintas é " + valorFormula);
        System.out.println("----------------------------------------");
        System.out.println("Resultado é R$ " + valorLata2);*/

        //Letra B
        /*
        quantidadeTintas = metrosQuadradosUsuario / 21.6;
        BigDecimal valorDecimal = new BigDecimal(quantidadeTintas);
        valorDecimal = valorDecimal.setScale(2, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        double valorLata = quantidadeTintas * 25.00;
        BigDecimal valor = new BigDecimal(valorLata);
        valor = valor.setScale(2, RoundingMode.HALF_UP);
        double valorLata2 = valor.doubleValue();

        System.out.println("A quantidade de tintas é " + valorFormula);
        System.out.println("----------------------------------------");
        System.out.println("Resultado é R$ " + valorLata2);*/

        quantidadeTintas = metrosQuadradosUsuario / 129.6;
        double acrecimo = quantidadeTintas * 0.1;
        BigDecimal valorDecimal = new BigDecimal(quantidadeTintas);
        valorDecimal = valorDecimal.setScale(2, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        valorLata = quantidadeTintas * 105.00;
        BigDecimal valorJunto = new BigDecimal(valorLata);
        valorJunto = valorJunto.setScale(2, RoundingMode.HALF_UP);
        double valorDaLataTotal = valorJunto.doubleValue();

        System.out.println("A quantidade de tintas é " + valorFormula);
        System.out.println("----------------------------------------");
        System.out.println("Acresentado " + acrecimo);
        System.out.println("-----------------------------------------");
        System.out.println("Valor total é " + valorDaLataTotal);

    }
}
