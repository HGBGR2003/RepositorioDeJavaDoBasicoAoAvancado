package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex5 {
    public static void main(String[] args) {
        float nota1;
        float nota2;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota:"));

        float media = (nota1 + nota2) / 2;

        if (media < 10 || media == 7 ){
            System.out.println("APROVADO");
        }else if (media < 7.0){
            System.out.println("REPROVADO");
        }else if (media == 10){
            System.out.println("APROVADO SEM DISTINÇÃO");
        }

    }
}
