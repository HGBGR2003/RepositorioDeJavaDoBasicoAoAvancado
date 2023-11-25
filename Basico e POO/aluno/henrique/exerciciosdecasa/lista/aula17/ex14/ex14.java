package aluno.henrique.exerciciosdecasa.lista.aula17.ex14;

import javax.swing.*;

public class ex14 {
    public static void main(String[] args) {
        int numeroPrincipal = 0;
        ParOuImpar pi = new ParOuImpar();

        int quantidadePares = 0;
        int quantidadeImpares = 0;


        for (int i = 0; i < 10; i++) {
            numeroPrincipal = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));

            pi.Par(numeroPrincipal);

            if (numeroPrincipal % 2 == 0){
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }

        }


    }
}
