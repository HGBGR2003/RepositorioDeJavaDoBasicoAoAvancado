package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex5 {
    public static void main(String[] args) {
        double nota1;
        double nota2;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota:"));

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        }else if (media >= 7.0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }
}
