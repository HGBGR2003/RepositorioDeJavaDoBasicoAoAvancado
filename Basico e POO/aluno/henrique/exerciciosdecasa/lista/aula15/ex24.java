package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex24 {
    public static void main(String[] args) {
        double numeroDigitado;
        numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog("Entre com um número:"));
        String imparOuPar;
        String positivoNegativo;
        String decimalOuNao;

        if (numeroDigitado % 2 == 0){
            imparOuPar = "par";
        }else{
            imparOuPar = "impar";
        }

        if(numeroDigitado > 0){
            positivoNegativo = "positvo";
        }else{
            positivoNegativo = "negativo";
        }

        if (numeroDigitado % 1 != 0){
            decimalOuNao = "decimal";
        }else{
            decimalOuNao = "inteiro";
        }

        System.out.println();

    }
}
