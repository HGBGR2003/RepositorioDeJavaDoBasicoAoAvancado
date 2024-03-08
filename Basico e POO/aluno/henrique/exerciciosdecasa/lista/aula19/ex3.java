package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        String nome = null;
        int idade = 0;
        double salario = 0;
        String sexoHumano;
        String estadoCivil;

        nome = JOptionPane.showInputDialog("Entre com seu nome com até 3 caracteres.");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade entre 0 á 150:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu salario maior que 0:"));
        sexoHumano = JOptionPane.showInputDialog("Entre com seu sexo masculino (M) ou feminino (F)");
        estadoCivil = JOptionPane.showInputDialog("Qual é o seu estado civil: (s,c,v,d)");

        if (nome.length() < 3){
            nome = JOptionPane.showInputDialog("Entre com seu nome com até 3 caracteres.");
        }

        if (idade < 0 || idade > 150){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade entre 0 á 150"));
        }

        if (salario < 0){
            salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu salario maior que 0:"));
        }

        if (sexoHumano.equals("m") || sexoHumano.equals("f")){
           sexoHumano = JOptionPane.showInputDialog("Informe um sexo M ou F:");
        }

       if (!estadoCivil.equals("s") || !estadoCivil.equals("c") || !estadoCivil.equals("v") || !estadoCivil.equals("d")){
           estadoCivil = JOptionPane.showInputDialog("Entre com seu estado civil de novo: (s,c,v,d)");
       }

        System.out.println("O seu nome: " + nome);
        System.out.println("A sua idade: " + idade);
        System.out.println("O seu salario é de: " + salario);
        System.out.println("O seu sexo : " + sexoHumano);
        System.out.println("O seu estado civil é: " + estadoCivil);



    }
}
