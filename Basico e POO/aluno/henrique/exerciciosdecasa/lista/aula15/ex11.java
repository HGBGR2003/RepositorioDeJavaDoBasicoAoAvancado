package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex11 {
    public static void main(String[] args) {
        double salarioColabarador;
        double aumentoSalarial = 0;
        double percentual = 0;

        salarioColabarador = Double.parseDouble(JOptionPane.showInputDialog("Entre com o seu sálario colaborador:"));

        if (salarioColabarador <= 280.00){
            percentual = 0.2;
            aumentoSalarial = (salarioColabarador * percentual) + salarioColabarador;
        }else if (salarioColabarador >= 280.00 && salarioColabarador < 700.00){
            percentual = 0.15;
            aumentoSalarial = (salarioColabarador * percentual) + salarioColabarador;
        } else if (salarioColabarador >= 700.00 && salarioColabarador < 1500.00) {
            percentual = 0.1;
            aumentoSalarial = (salarioColabarador * percentual) + salarioColabarador;
        }

        if (salarioColabarador >= 1500.00){
            percentual = 0.05;
            aumentoSalarial = (salarioColabarador * percentual) + salarioColabarador;
        }

        System.out.println("Sálario antes do reajuste R$ " + salarioColabarador);
        System.out.println("Quanto foi aumentado " + percentual);
        System.out.println("Valor aumentado " + aumentoSalarial);
        System.out.println("Novo salário R$ " + aumentoSalarial);



    }
}
