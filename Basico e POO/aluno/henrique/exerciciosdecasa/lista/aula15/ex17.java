package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex17 {
    // Feito com o Chat
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean ehBissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    ehBissexto = true;
                }
            } else {
                ehBissexto = true;
            }
        }

        if (ehBissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
