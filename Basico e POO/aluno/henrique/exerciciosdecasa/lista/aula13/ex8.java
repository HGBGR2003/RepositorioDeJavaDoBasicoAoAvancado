package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex8 {
    public static void main(String[] args) {
        double horas_trabalhadas;
        double horas;
        double valorResutaldo;

        horas_trabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor/hora ?"));
        horas = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade de horas trabalhadas no mês: ?"));

        valorResutaldo = horas_trabalhadas * horas;

        System.out.println("O valor do sálario é " + valorResutaldo);

    }
}
