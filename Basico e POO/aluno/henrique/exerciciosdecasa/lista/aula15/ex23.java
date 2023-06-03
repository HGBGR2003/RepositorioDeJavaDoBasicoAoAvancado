package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex23 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
        JOptionPane.showMessageDialog(null,"O número irá ser verificado para Inteiro ou Decimal");
        if (numero != '.'){
            System.out.println("INTEIRO");
        }else{
            String numeroTexto = String.valueOf(numero);
            numeroTexto.contains(".");
            System.out.println("DECIMAL");
        }
    }
}
