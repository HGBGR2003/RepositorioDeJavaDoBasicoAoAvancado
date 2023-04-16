package aluno.henrique.exerciciosdecasa.lista.aula13;

import javax.swing.*;
public class ex9 {
    public static void main(String[] args) {
        double temperaturaFare;
        double conversao;

        temperaturaFare = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Fahrenheit?"));
        conversao = 5 * (temperaturaFare - 32) / 9;
        System.out.println("A temperatura em Celsius é : " + conversao);
    }
}
