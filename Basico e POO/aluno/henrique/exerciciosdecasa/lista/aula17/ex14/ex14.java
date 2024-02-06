package aluno.henrique.exerciciosdecasa.lista.aula17.ex14;

import javax.swing.*;

public class ex14 {
    public static void main(String[] args) {
        int numeroPrincipal;
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

        System.out.println("A quantidade total de números pares é: " + quantidadePares);
        System.out.println("A quantidade total de números ímpares é: " + quantidadeImpares);
    }
}
