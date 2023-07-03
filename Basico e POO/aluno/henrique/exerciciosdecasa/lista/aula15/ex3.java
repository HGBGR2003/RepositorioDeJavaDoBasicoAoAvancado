package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        String sexoPessoa;

        sexoPessoa = JOptionPane.showInputDialog("Entre com seu sexo: (M/F)");

        //EqualsIngnoreCase retira a propriedade de maiusculo ou minusculo.
        if (sexoPessoa.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        }else if(sexoPessoa.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }else{
            System.out.println("Sexo Inválido");
        }

    }
}
