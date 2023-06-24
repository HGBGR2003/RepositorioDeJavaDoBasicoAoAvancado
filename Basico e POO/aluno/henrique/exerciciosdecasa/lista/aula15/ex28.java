package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex28 {
    public static void main(String[] args) {
        double precoFileTabajara;
        double precoAlcataraTabajara;
        double precoPicanhaTabajara;
        String tipo;
        String tipoDePagamento;
        double desconto = 0;

        tipo = JOptionPane.showInputDialog("Entre com o tipo da carne, temos file duplo, alcatra e picanha");


        switch (tipo){
            case "file duplo":
            double quantidadeDeCarnesKiloFile = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de file duplo:"));
                if (quantidadeDeCarnesKiloFile <= 5){
                    double totalFile = quantidadeDeCarnesKiloFile * 4.90;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                         desconto = totalFile - 0.1;
                    }else{
                        desconto = totalFile;
                    }
                    System.out.println("Total do preço do kilo dos filés até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesKiloFile + " e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + desconto);

                } else if (quantidadeDeCarnesKiloFile > 5) {
                    double totalFile2 = quantidadeDeCarnesKiloFile * 5.80;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        desconto = totalFile2 - 0.1;
                    }else{
                        desconto = totalFile2;
                    }
                    System.out.println("Total do preço do kilo dos filés Acima de 5 Kg, a quantidade de filés é " + quantidadeDeCarnesKiloFile + " e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + desconto);
                }

                break;

            case "alcatra":
                double quantidadeDeCarnesAlcatra = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de alcatra:"));
                if (quantidadeDeCarnesAlcatra <= 5){
                    double totalAlcatra = quantidadeDeCarnesAlcatra * 5.90;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        desconto = totalAlcatra - 0.1;
                    }else{
                        desconto = totalAlcatra;
                    }
                    System.out.println("Total do preço do kilo da alcatra até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesAlcatra + " e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + desconto);
                }

                if (quantidadeDeCarnesAlcatra > 5){
                    double total2 = quantidadeDeCarnesAlcatra * 5.80;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        desconto = total2 - 0.1;
                    }else{
                        desconto = total2;
                    }
                    System.out.println("Total do preço do kilo da alcatra até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesAlcatra + " e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + desconto);
                }

                break;

            case "picanha":
                double quantidadeDeCarnesPicanha = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de picanha:"));
                if (quantidadeDeCarnesPicanha <= 5){

                }
        }
    }
}
