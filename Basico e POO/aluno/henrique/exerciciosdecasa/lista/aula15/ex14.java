package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double mediaDasNotas;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Entre com a primeira nota ?");
        nota1 = impressora.nextDouble();
        System.out.println("---------------------------");
        System.out.println("Entre com a segunda nota ?");
        nota2 = impressora.nextDouble();
        System.out.println("---------------------------");

        mediaDasNotas = (nota1 + nota2) / 2;

        DecimalFormat df = new DecimalFormat("#.#");
        String result = df.format(mediaDasNotas);

        System.out.println("A media é " + result);
        System.out.println("--------------------");

        if (mediaDasNotas > 9 && mediaDasNotas <= 10){
            System.out.println("A");
            System.out.println("---------");
            System.out.println("APROVADO");
        } else if (mediaDasNotas > 7.5 && mediaDasNotas <= 9 ) {
            System.out.println("B");
            System.out.println("---------");
            System.out.println("APROVADO");
        } else if (mediaDasNotas > 6 && mediaDasNotas <= 7.5) {
            System.out.println("C");
            System.out.println("---------");
            System.out.println("APROVADO");
        } else if (mediaDasNotas > 4 && mediaDasNotas <= 6.0) {
            System.out.println("D");
            System.out.println("---------");
            System.out.println("REPROVADO");
        } else if (mediaDasNotas <=  4 || mediaDasNotas == 0) {
            System.out.println("E");
            System.out.println("---------");
            System.out.println("REPROVADO");
        }

    }
}
