package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {

        String letraUsuario = JOptionPane.showInputDialog("Informe uma letra :");

        if (letraUsuario.length() > 1){
            System.out.println("Não é uma letra válida:");
        }else{
            switch(letraUsuario){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":

                case "U":
                    System.out.println("Vogal");
                    break;

                default:
                    System.out.println("Consoante");
            }
        }
    }
}
