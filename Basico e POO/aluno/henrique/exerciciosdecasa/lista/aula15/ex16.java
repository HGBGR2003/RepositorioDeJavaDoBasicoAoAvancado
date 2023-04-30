package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex16 {
    public static void main(String[] args) {
        /*
        d. Se o delta for positivo, a equação possui duas raiz reais;
        informe-as ao usuário;
         */

        double a;
        double b;
        double c;
        double delta;
        double aoQuadrado;

        a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de c:"));

        aoQuadrado = Math.pow(b,2);

        delta = -(aoQuadrado) - 4 * a * c;
        double xResposta1;
        double xResposta2;
        double raiz = Math.sqrt(delta);
        xResposta1 = (- b - raiz) / 2;
        xResposta2 = (- b + raiz) / 2;

        if (a == 0){
            System.exit(0);
        }

        if (delta < 0){
            System.out.println("Não possui raizes");
            System.exit(0);
        }

        if (delta == 0){
            System.out.println("Possui apenas uma raiz real:");
            System.out.println("x1 = " + xResposta1);
        }

        if (delta > 0){
            System.out.println("x1 = " + xResposta1 + ", x2 = " + xResposta2);
        }


    }
}
