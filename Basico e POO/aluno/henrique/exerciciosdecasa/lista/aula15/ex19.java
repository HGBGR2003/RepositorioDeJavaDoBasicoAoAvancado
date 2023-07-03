package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex19 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número:"));

        String operacao = JOptionPane.showInputDialog("Entre com a operação (+ - / *):");

        double resultado = 0;
        boolean valida = true; // Isso se chama "flag"

        switch (operacao){
            case "+": resultado = numero1 + numero2; break;
            case "-": resultado = numero1 - numero2; break;
            case "*": resultado = numero1 * numero2; break;
            case "/": resultado = numero1 / numero2; break;
            default:
                System.out.println("Operação Inválida");
                valida = false;
        }

        if (valida){

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0){
                System.out.println("Resultado Positivo");
            }else{
                System.out.println("Resultado Negativo");
            }

            if (resultado % 2 == 0){
                System.out.println("Resultado Par");
            }else{
                System.out.println("Resultado Impar");
            }

        }

    }
}
