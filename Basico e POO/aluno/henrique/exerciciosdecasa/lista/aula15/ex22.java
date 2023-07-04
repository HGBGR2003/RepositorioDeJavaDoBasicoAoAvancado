package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner ajudador = new Scanner(System.in);

        System.out.println("Entre com a quantidade (Kg) de morangos:");
        double qtdMorango = ajudador.nextDouble();

        System.out.println("Entre com a quantidade (Kg) de maças:");
        double qtdMaca = ajudador.nextDouble();

        double precoKgMorango = 0;

        if (qtdMorango <= 5){
            precoKgMorango = 2.5;
        }else{
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;

        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        }else{
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMaca + precoKgMorango;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial -  ((precoParcial) / 100) * 10;
        }
        System.out.println("Preco Total = " + precoTotal);
    }
}






