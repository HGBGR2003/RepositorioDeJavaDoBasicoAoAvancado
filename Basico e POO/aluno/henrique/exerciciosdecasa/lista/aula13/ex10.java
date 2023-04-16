package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex10 {
    public static void main(String[] args) {
        double temperaturaCelsius;

        temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Celisus"));
        double conversaoFarenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("A temperatura de Celsius para Farenheit é " + conversaoFarenheit);

    }
}
