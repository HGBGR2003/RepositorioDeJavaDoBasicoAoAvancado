package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex21 {
    public static void main(String[] args) {
        int notas;
        int [] notasDisponiveis = {100,50,10,5,1};
        int [] quantidadeNotas = new int[5];


        notas = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma quantia em reais:"));

        if (notas < 10 || notas > 600){
            System.out.println("Valor inválido. O valor mínimo é 10 e o máximo é 600.");
        }else{
            for (int i = 0; i < notasDisponiveis.length; i++){
                quantidadeNotas[i] = notas / notasDisponiveis[i];
                notas %= notasDisponiveis[i];
            }

            System.out.println("Notas fornecidas:");
            for (int i = 0; i < notasDisponiveis.length; i++){
                if(quantidadeNotas[i] > 0){
                    System.out.println(quantidadeNotas[i] + " nota(s) de " + notasDisponiveis[i] + " reais");
                }

            }

        }

    }
}
