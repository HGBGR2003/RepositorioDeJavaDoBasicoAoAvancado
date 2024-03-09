package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe2 {
    public static void main(String[] args) {
        int [] vetorA = new int[8];
        int [] vetorB = new int[8];
        int valorUsuario;
        int multiRespota;

        for (int i = 0; i < vetorA.length; i++){
            valorUsuario = Integer.parseInt(JOptionPane.showInputDialog(" Entre com um valor inteiro: "));
            vetorA [i] = valorUsuario;
            multiRespota = vetorA[i] * 2;
            vetorB[i] = multiRespota;

            System.out.println( "Vetor B: " + vetorA[i] +  " - Respota da Multiplicação: " + multiRespota);


        }


    }
}
