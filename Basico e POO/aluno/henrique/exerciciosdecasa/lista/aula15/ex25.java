package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex25 {
    public static void main(String[] args) {
        int contador = 0;
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        String resposta5;

        resposta1 = JOptionPane.showInputDialog("Telefonou para a Vitima?");
        if (resposta1.equalsIgnoreCase("sim")){
            contador++;
        }

        resposta2 = JOptionPane.showInputDialog("Esteve no local?");
        if (resposta2.equalsIgnoreCase("sim")){
            contador++;
        }

        resposta3 = JOptionPane.showInputDialog("Mora perto da Vitima?");
        if (resposta3.equalsIgnoreCase("sim")){
            contador++;

        }

        resposta4 = JOptionPane.showInputDialog("Devia para a Vitima?");
        if (resposta4.equalsIgnoreCase("sim")){
            contador++;
        }

        resposta5 = JOptionPane.showInputDialog("Já Trabalhou para a Vítima?");
        if(resposta5.equalsIgnoreCase("sim")){
            contador++;
        }

    }
}
