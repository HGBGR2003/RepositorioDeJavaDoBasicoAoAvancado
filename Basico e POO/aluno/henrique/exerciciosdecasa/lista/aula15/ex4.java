package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {
        String letraUsuario = JOptionPane.showInputDialog("Informe uma letra :");
        switch (letraUsuario){
            case "a":
                System.out.println("Vogal");
                break;

            case "e":
                System.out.println("Vogal");
                break;

            case "i":
                System.out.println("Vogal");
                break;

            case "o":
                System.out.println("Vogal");
                break;

            case "u":
                System.out.println("Vogal");
                break;

            default:
                System.out.println("Consoante");
        }
    }
}
