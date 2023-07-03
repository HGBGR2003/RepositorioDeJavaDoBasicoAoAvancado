package aluno.henrique.exerciciosdecasa.ExercicioBonus;

import javax.swing.*;

public class ex28 {
    public static void main(String[] args) {
        String tipo;
        String usaCartao;
        CalculoDosPrecosDasCarnes calculo = new CalculoDosPrecosDasCarnes();

        tipo = JOptionPane.showInputDialog("Entre com o tipo da carne, temos file duplo, alcatra e picanha:");
        double quantidadeKilosCarne = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade de quilos de carne " + tipo));
        usaCartao = JOptionPane.showInputDialog("Sua forma de pagamento ? (Usando o cartao Tabajara 5%)");

        calculo.precoCarneMenorQue5(tipo);
        calculo.precoCarneMaiorQue5(tipo);

        calculo.calculoPreco(quantidadeKilosCarne,tipo,usaCartao);




    }
}
