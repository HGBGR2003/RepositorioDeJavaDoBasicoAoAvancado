package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex15 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro lado do triangulo: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo lado do triangulo: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro lado do triangulo: "));

        int soma = a + b;

        if (soma > c){
            System.out.println("É um triângulo:");
            System.out.println("-----------------");

        }else {
            System.exit(0);
        }

        if ((a == b && a == c) && (b == a && b == c) && (c == a && c == b) ){
            System.out.println("É EQUILÁTERO");
        } else if ((a == b || c == b || c == a)) {
            System.out.println("É ISOSCELES");
        } else if (a != b && b != c) {
            System.out.println("É ESCALENO");
        }

    }
}
