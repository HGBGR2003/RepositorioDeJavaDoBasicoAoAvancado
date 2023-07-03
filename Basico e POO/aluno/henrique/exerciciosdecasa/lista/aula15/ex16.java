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

        if (a == 0){
            System.out.println("Não é equação de segundo grau");
        }else{
            delta = (b * b) - 4 * a * c;

            if (delta < 0){
                System.out.println("Delta Negativo");
            }else{

                System.out.println("delta: " + delta);

                double raiz = Math.sqrt(delta);

                xResposta1 = ( - b - raiz) / (2 * a);

                xResposta2 = (- b + raiz) / (2 * a);

                truncado1 = Math.floor(xResposta1);
                truncado2 = Math.floor(xResposta2);

                if (delta == 0){
                    System.out.println("Possui apenas uma raiz real:");
                    System.out.println("x1 = " + truncado1);
                }

                if (delta > 0){
                    System.out.println("x1 = " + truncado1 + ", x2 = " + truncado2);
                }
            }
        }

    }
}
