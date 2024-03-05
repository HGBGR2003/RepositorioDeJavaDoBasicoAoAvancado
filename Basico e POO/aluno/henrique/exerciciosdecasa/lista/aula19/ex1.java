package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        int notaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe um nota entre 0 e 10:"));

        while (notaUsuario < 0 || notaUsuario > 10){
            notaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Infomre outra nota no intervalo de 0 e 10:"));
            if (notaUsuario == 0){ //Mandando.
                System.out.println("Nota Válida:" + notaUsuario);
            }
        }
    }
}
