package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex23 {
    public static void main(String[] args) {
        double numero1;
        double numero2;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro número: (Com ponto se for decimal)"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo número: (Com ponto se for decimal)"));

        System.out.println(numero1 + " é decimal ? " + "\n" + verificarDecimal(numero1));
        System.out.println("---------------");
        System.out.println(numero2 + " é decimal ? " + "\n" + verificarDecimal(numero2));
    }

    public static boolean verificarDecimal(double numero) {
        if (numero % 1 != 0) {
            return true;
        } else {
            return false;
        }
    }
}






