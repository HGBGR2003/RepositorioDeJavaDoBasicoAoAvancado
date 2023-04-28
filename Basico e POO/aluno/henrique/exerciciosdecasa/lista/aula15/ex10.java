package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex10 {
    public static void main(String[] args) {
        String turnoClasse;
        turnoClasse = JOptionPane.showInputDialog("Entre com seu turno caro aluno:(M/V Ou N)");
        //Outro Jeito
        switch (turnoClasse) {
            case "m" -> System.out.println("Bom dia");
            case "v" -> System.out.println("Boa tarde");
            case "n" -> System.out.println("Boa noite");
            default -> System.out.println("Valor Inválido");
        }
    }
}
