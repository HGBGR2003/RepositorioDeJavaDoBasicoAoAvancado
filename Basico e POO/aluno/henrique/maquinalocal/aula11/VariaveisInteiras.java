package aluno.henrique.maquinalocal.aula11;

import javax.swing.*;

public class aaaa {
    public static void main(String[] args) {
        int a;
        int b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        int soma = a+b;
        if (soma %2 != 0){
            JOptionPane.showMessageDialog(null,"È IMPAR");
        }
    }
}
