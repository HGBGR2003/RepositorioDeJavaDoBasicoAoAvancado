package aluno.henrique.exerciciosdecasa.lista.aula15.Exercicio28;

import javax.swing.*;

public class ex28 {
    public static void main(String[] args) {
        String tipo;
        String usaCartao;
        CalculoDosPrecosDasCarnes calculo = new CalculoDosPrecosDasCarnes();

        tipo = JOptionPane.showInputDialog("Entre com o tipo da carne, temos file duplo, alcatra e picanha:");
        double quantidadeKilosCarne = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade de quilos de carne " + tipo));
        usaCartao = JOptionPane.showInputDialog("Sua forma de pagamento ? (Usando o cartao Tabajara 5%)");


        calculo.calculoPreco(quantidadeKilosCarne,tipo,usaCartao);




    }
}
