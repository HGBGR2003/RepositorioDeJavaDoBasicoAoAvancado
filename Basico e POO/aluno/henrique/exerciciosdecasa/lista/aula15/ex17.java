package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex17 {
    // Feito com o Chat
    public static void main(String[] args) {
        int ano;
        boolean ehBissexto = false;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano para vermos se é bissexto ou não:"));

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }

    }
}
