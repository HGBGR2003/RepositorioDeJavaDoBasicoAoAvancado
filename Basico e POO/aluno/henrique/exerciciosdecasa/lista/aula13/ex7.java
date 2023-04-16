package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);
        double valorDOLado;

        System.out.println("Informe um dos lados do triangulo ?");
        valorDOLado = imprimir.nextDouble();

        System.out.println("---------------------------");

        double areaQuadrado = valorDOLado * valorDOLado;
        double dobradoValor = areaQuadrado * 2;

        System.out.println("O valor da área " + areaQuadrado);
        System.out.println("---------------------------");
        System.out.println("O valor da área dobrado " + dobradoValor);


    }
}
