package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex5 {
    public static void main(String[] args) {
        int numeroHabitanteA;
        int numeroHabitanteB;
        double taxaA;
        double taxaB;
        int anos = 0;

        numeroHabitanteA = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de habitantes em inteiro de A:"));
        numeroHabitanteB = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de habitantes em inteiro de B:"));

        taxaA = Double.parseDouble(JOptionPane.showInputDialog("Entre com a taxa de crescimento anual de A:"));
        taxaB = Double.parseDouble(JOptionPane.showInputDialog("Entre com a taxa de crescimento anual de B:"));

        double taxaAConvertida = taxaA / 100;
        double taxaBConvertida = taxaB / 100;

        while (numeroHabitanteA <= numeroHabitanteB){
            numeroHabitanteA += (int) (numeroHabitanteA * taxaAConvertida);
            numeroHabitanteB += (int) (numeroHabitanteB * taxaBConvertida);
            anos++;
        }
        System.out.println("Número de anos necessários para A ultrapassar B: " + anos);
    }
}
