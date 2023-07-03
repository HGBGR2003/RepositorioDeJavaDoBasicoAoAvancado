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

        String aproveitamento = null;

        if (mediaDasNotas > 9 && mediaDasNotas <= 10){
            aproveitamento = "A";
            System.out.println("---------");
        } else if (mediaDasNotas > 7.5 && mediaDasNotas <= 9 ) {
            aproveitamento = "B";
            System.out.println("---------");
        } else if (mediaDasNotas > 6 && mediaDasNotas <= 7.5) {
            aproveitamento = "C";
            System.out.println("---------");
        } else if (mediaDasNotas > 4 && mediaDasNotas <= 6.0) {
            aproveitamento = "D";
            System.out.println("---------");
        } else if (mediaDasNotas >=  4 || mediaDasNotas < 0) {
            aproveitamento = "E";
            System.out.println("---------");
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + mediaDasNotas);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO");
                break;
        }

    }
}
