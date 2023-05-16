package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;
import java.util.Scanner;

public class ex17 {
    // Feito com o Chat
    public static void main(String[] args) {
        int ano;
        boolean ehBissexto = false;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano para vermos se é bissexto ou não:"));

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

    }
}
