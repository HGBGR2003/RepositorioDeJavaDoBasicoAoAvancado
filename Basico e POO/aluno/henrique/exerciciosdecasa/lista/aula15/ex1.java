package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número:"));

        if (numero1 > numero2){
            System.out.println("O número maior foi este que é " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O número maior foi este que é " + numero2);
        }

    }
}
