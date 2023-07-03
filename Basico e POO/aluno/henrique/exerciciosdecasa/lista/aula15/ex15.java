package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex15 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro lado do triangulo: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo lado do triangulo: "));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro lado do triangulo: "));

        if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2)
                && ((lado2 + lado3) > lado1)){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles");
            }
            
        }else{
            System.out.println("Não forma um triangulo");
        }





    }
}
