package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex8 {
    public static void main(String[] args) {
        double horas_trabalhadas;
        double salarioMensal;
        double valorResutaldo;

        horas_trabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas voê trabalha por mês?"));
        salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sálario?"));

        valorResutaldo = horas_trabalhadas * salarioMensal;

        System.out.println("O valor do sálario é " + valorResutaldo);

    }
}
