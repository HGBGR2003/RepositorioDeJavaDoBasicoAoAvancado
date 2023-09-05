package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex7 {
    public static void main(String[] args) {
        int i1 = 5;
        int numeroUsuario [];
        int maior = -100;

        for (int i = 0; i < i1; i++){
             numeroUsuario = new int[i1];
             numeroUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
             System.out.println(numeroUsuario[i]);

            if (numeroUsuario[i] > maior){
                maior = numeroUsuario[i];
            }
        }

        System.out.println("O número maior é : " + maior);

    }
}
