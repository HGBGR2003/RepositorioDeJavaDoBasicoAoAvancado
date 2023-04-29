package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex12 {
    public static void main(String[] args) {
        double valorMensalSalarial;
        double quantidadeHoras;
        double desconto = 0;

        quantidadeHoras =  Double.parseDouble(JOptionPane.showInputDialog("Entre com sua quantidade de horas:"));
        valorMensalSalarial =  Double.parseDouble(JOptionPane.showInputDialog("Entre com seu sálario:"));
        double salarioBruto = valorMensalSalarial * quantidadeHoras;

        if (salarioBruto <= 900.00){
            System.out.println("Sem cobrança");
        } else if (salarioBruto <= 1500.00) {
            desconto = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.00 ) {
            desconto = salarioBruto * 0.1;
        }

        if(salarioBruto > 2500.00){
            desconto = salarioBruto * 0.2;
        }

        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDesconto = desconto + inss;
        double salarioLiquido = salarioBruto - desconto - inss;

        System.out.println("Salario Bruto é R$ " + salarioBruto);
        System.out.println("IR (5%): R$ " + desconto);
        System.out.println("INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " +  totalDesconto);
        System.out.println("Sálario Liquido: R$ " +  salarioLiquido);

    }
}
