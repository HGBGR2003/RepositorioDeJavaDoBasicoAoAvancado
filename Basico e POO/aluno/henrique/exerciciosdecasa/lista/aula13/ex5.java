package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

    System.out.println("Informe uma media em metros:");
    double medidaConvertida = impressora.nextDouble();

    double medidaEmCelsius;

    medidaEmCelsius = medidaConvertida / 100;

    System.out.println("De metros para cm fica: " + medidaEmCelsius);


    }
}
