package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        final double valorDosPeixes = 50.0;
        final double valorDaMulta = 4.0;
        double pesoDosPeixes;
        double excesso;
        double multa = 0.0;
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Informe o peso dos peixes");
        pesoDosPeixes = imprimir.nextDouble();
        System.out.println("----------------------------------------------------------------------------");

        excesso = pesoDosPeixes - valorDosPeixes;

        if (pesoDosPeixes > valorDosPeixes){
            multa = excesso * valorDaMulta;
            System.out.printf("O peso excedente foi de %.2f kg. O valor da multa a pagar é de R$ %.2f.\n", excesso, multa);
        }else{
            System.out.println("Não tem multa");
        }



    }
}
