package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex19 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));

        int centena = numero/100;

        int dezena = (numero % 100) / 10;

        int unidade = (numero % 100) % 10;

        System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades");


    }
}
