package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);
        System.out.println("Entre com um número para o dia no formato dd");
        int dia = impressora.nextInt();

        System.out.println("Entre com um número para o mês no formato mm");
        int mes = impressora.nextInt();

        System.out.println("Entre com um número para o ano no formato aaaa");
        int ano = impressora.nextInt();

        if (dia > 0  && dia <= 31){
            System.out.println("Dia consistente");
        } else if (mes > 0 && mes < 12) {
            System.out.println("Mês consistente");
        } else if (ano > 0) {
            System.out.println();
        }

    }
}
