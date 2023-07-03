package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex6 {
    public static void main(String[] args) {
        int numero1,numero2,numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número inteiro:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número inteiro:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro número inteiro:"));

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O numero1 é maior " + numero1);
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O numero2 é maior " + numero2);
        }else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("O numero3 é maior " + numero1);
        }

    }
}
