package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex16 {
    public static void main(String[] args) {
        double notaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Informe um nota entre 0 e 10:"));

        while (notaUsuario < 0 || notaUsuario > 10){
            JOptionPane.showMessageDialog(null,"Informação Incorreta, faça de novo!");
            notaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Infomre outra nota no intervalo de 0 e 10:"));
            if (notaUsuario >= 0 && notaUsuario <= 10){
                System.out.println("Nota Válida : " + notaUsuario);
            }
        }
    }
}
