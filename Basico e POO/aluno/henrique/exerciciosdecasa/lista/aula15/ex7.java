package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex7 {
    public static void main(String[] args) {
        int numero1,numero2,numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número inteiro:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro número inteiro:"));

        //Maior

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O número maior é este " + numero1);
            System.out.println("---------------------------------");
        }

        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número maior é este " + numero2);
            System.out.println("---------------------------------");
        }

        if (numero3 > numero1 && numero3 > numero2){
            System.out.println("O número maior é este " + numero3);
            System.out.println("---------------------------------");
        }

        //Menor
        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("O número menor é este " + numero1);
            System.out.println("---------------------------------");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O número menor é este " + numero2);
            System.out.println("---------------------------------");
        }else if (numero3 < numero1 && numero3 < numero2){
            System.out.println("O número menor é este " + numero3);
            System.out.println("---------------------------------");
        }

    }
}
