package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex20 {
    public static void main(String[] args) {
        Continuacao20 c20 = new Continuacao20();
        double nota1;
        double nota2;
        double nota3;

       nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota:"));
       nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a segunda nota:"));
       nota3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a terceira nota:"));

       double media = (nota1 + nota2 + nota3)/3;
       c20.truncar(media);


       if (media >= 7){
           System.out.println("APROVADO");
       } else if (media <= 7) {
           System.out.println("REPROVADO");
       } else if (media == 10) {
           System.out.println("APROVADO COM DISTINÇÃO");
       }

    }
}
