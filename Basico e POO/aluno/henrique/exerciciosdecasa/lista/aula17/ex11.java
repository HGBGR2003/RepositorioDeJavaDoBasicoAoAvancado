package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex11 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número menor:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número limite:"));

        for (int i = 0; i < numero2; i++){
            if (i > numero1 && i < numero2){
                System.out.println(i);
                System.out.println("-------------------------");

                soma = soma + i;
                System.out.println(soma);
            }






        }
    }
}
