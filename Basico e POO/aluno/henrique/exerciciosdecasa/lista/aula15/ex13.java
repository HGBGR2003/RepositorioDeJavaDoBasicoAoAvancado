package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex13 {
    public static void main(String[] args) {
        int diaSemana;
       diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Entre com dia da semana:"));
       switch (diaSemana){
           case 1:
               System.out.println("Domingo");
                break;
           case 2:
               System.out.println("Segunda-Feira");
               break;
           case 3:
               System.out.println("Terça-Feira");
               break;
           case 4:
               System.out.println("Quarta-Feira");
               break;
           case 5:
               System.out.println("Quinta-Feira");
               break;
           case 6:
               System.out.println("Sexta-Feira");
               break;
           case 7:
               System.out.println("Sábado");
               break;
       }
    }
}
