package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        double quantidadeMorangosKg;
        double quantidadeMacasKg;
        Scanner qtde = new Scanner(System.in);

        System.out.println("Entre com a quantidade de quilos de Morangos:");
        quantidadeMorangosKg = qtde.nextDouble();

        System.out.println("Entre com a quantidade de quilos de Maçãs");
        quantidadeMacasKg = qtde.nextDouble();

        double desconto;
        if (quantidadeMorangosKg <= 5){
            double totalPreco;
            totalPreco = quantidadeMorangosKg * 2.50;
            System.out.println("Total do preço do kilo dos morangos até 5 Kg: " + totalPreco);
        }

        if (quantidadeMorangosKg > 5){
            double totalPreco = quantidadeMorangosKg * 2.20;
            System.out.println("Total do preço do kilo dos morangos de Acima de 5 Kg: " + totalPreco);
        }

        if (quantidadeMacasKg <= 5){
            double totalPrecoMacas = quantidadeMacasKg * 1.80;
            System.out.println("Total do preço do kilo das maçãs até de 5 Kg: " + totalPrecoMacas);
        } else if (quantidadeMacasKg > 5) {
            double totalPrecosMacas = quantidadeMacasKg * 1.50;
            System.out.println("Total do preço do kilo das maçãs de Acima de 5 Kg: " + totalPreco);
        }
    }
}
