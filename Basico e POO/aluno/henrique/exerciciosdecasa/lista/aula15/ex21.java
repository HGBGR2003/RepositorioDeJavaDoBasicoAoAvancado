package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sfc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de litros vendidos:");
        double litros = sfc.nextDouble();

        System.out.println("Entre com tipo de combustivel:");
        String tipo = sfc.next();

         double precoGas = 2.5;
         double precoAlc = 1.9;
         double percentualDesconto = 0;
         double total = 0;
         double totalDesconto = 0;

         //Alcool
         if(tipo.equalsIgnoreCase("a")){
            if (litros <= 20){
                percentualDesconto = 3;
            }else{
                percentualDesconto = 5;
            }

            total = litros * precoAlc;

            //Gasolina
         } else if (tipo.equalsIgnoreCase("g")) {
             if (litros <= 20){
                 percentualDesconto = 4;
             }else{
                 percentualDesconto = 6;
             }

             total = litros * precoGas;

         }

        totalDesconto = (total / 100) * percentualDesconto;
        double precoApagar = total - totalDesconto;

        System.out.println("Valor a ser pago: " + precoApagar);

    }
}
