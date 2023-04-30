package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex16 {
    public static void main(String[] args) {
        double truncado1;
        double truncado2;
        double a;
        double b;
        double c;
        double delta;
        double xResposta1;
        double xResposta2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de c:"));

        delta =  b * b - 4 * a * c;

        double raiz = Math.sqrt(delta);

        xResposta1 = (- b - raiz) / 2 * a;
        xResposta2 = (- b + raiz) / 2 * a;

        truncado1 = Math.floor(xResposta1);
        truncado2 = Math.floor(xResposta2);

        if (a == 0){
            System.exit(0);
        }

        if (delta < 0){
            System.out.println("Não possui raizes reais");
            System.exit(0);
        }

        if (delta == 0){
            System.out.println("Possui apenas uma raiz real:");
            System.out.println("x1 = " + truncado1);
        }

        if (delta > 0){
            System.out.println("x1 = " + truncado1 + ", x2 = " + truncado2);
        }
        
        /*

bhaskara(2, 5, -3); // Output: x1 = 0.5, x2 = -3.0

bhaskara(3, -9, 6); // Output: x1 = 2.0, x2 = 1.0

bhaskara(1, 2, 1); // Output: x1 = -1.0, x2 = -1.0

bhaskara(1, -4, 4); // Output: x1 = 2.0, x2 = 2.0

         */

    }
}
