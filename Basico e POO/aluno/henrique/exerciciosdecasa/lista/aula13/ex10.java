package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;

public class ex10 {
    public static void main(String[] args) {
        double temperaturaCelsius;

        temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Celisus"));
        double conversaoFarenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura  " + temperaturaCelsius + " C é igual a " + conversaoFarenheit + " F");

    }
}
