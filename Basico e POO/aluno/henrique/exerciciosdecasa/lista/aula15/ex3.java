package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        String sexoPessoa;

        sexoPessoa = JOptionPane.showInputDialog("Entre com seu sexo: (M/F)");

        switch (sexoPessoa){
            case "M":
                System.out.println("Masculino");
                break;

            case "F":
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Sexo Inválido");
        }

    }
}
