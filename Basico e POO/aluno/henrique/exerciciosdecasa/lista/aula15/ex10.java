package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex10 {
    public static void main(String[] args) {
        String turnoClasse;
        turnoClasse = JOptionPane.showInputDialog("Entre com seu turno:");

        switch (turnoClasse) {
            case "m" :
            case "M": System.out.println("Bom dia"); break;
            case "v":
            case "V" : System.out.println("Boa tarde"); break;
            case "n":
            case "N" : System.out.println("Boa noite"); break;
            default : System.out.println("Valor Inválido");
        }
    }
}
