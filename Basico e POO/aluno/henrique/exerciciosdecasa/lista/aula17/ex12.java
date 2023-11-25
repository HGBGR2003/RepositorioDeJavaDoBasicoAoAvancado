package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex12 {
    public static void main(String[] args) {
        int numeroTabuada;
        int multi = 0;
        numeroTabuada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 á 10, e tenha sua tabuada"));

        for (int i = 1 ; i <= 10; i++){
            multi = numeroTabuada * i;
            System.out.println(numeroTabuada + " X " + i + " = " + multi);
        }

    }
}
