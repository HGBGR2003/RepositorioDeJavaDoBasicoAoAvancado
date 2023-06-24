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

        System.out.println("----------------------------------------------");

        double desconto = 0;
        if (quantidadeMorangosKg <= 5){
            double totalPreco;
            totalPreco = quantidadeMorangosKg * 2.50;
            double separacao = Math.floor(totalPreco * 100)/100;
            System.out.println("Total do preço do kilo dos morangos até 5 Kg: R$ " + separacao);
            System.out.println("----------------------------------------------------------------");
        }

        if (quantidadeMorangosKg > 5){
            double totalPreco2 = quantidadeMorangosKg * 2.20;
            double separacao = Math.floor(totalPreco2 * 100)/100;
            if (totalPreco2 > 25){
                desconto = separacao - 0.1;
            }else{
                desconto = separacao;
            }
            System.out.println("Total do preço do kilo dos morangos de Acima de 5 Kg ou 8 Kg: R$ " + separacao);
            System.out.println("-------------------------------------------------------------------------------");
        }

        if (quantidadeMacasKg <= 5){
            double totalPrecoMacas = quantidadeMacasKg * 1.80;
            double trucamento = Math.floor(totalPrecoMacas * 100)/100;
            System.out.println("Total do preço do kilo das maçãs até de 5 Kg: R$ " + trucamento);
            System.out.println("---------------------------------------------------------------");
        } else if (quantidadeMacasKg  > 5) {
            double totalPrecosMacas2 = quantidadeMacasKg * 1.50;
            double truncamento = Math.floor(totalPrecosMacas2 * 100)/100;
            if (totalPrecosMacas2 > 25){
                desconto = truncamento - 0.1;
            }else{
                desconto = truncamento;
            }
            System.out.println("Total do preço do kilo das maçãs de Acima de 5 ou 8 Kg: R$ " + truncamento);
        }


    }
}
