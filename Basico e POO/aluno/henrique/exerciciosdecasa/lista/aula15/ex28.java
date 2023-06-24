package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;

public class ex28 {
    public static void main(String[] args) {
        double precoFileTabajara = 0;
        double precoAlcataraTabajara = 0;
        double precoPicanhaTabajara = 0;
        String tipo;
        String tipoDePagamento;


        tipo = JOptionPane.showInputDialog("Entre com o tipo da carne, temos file duplo, alcatra e picanha");


        switch (tipo){
            case "file duplo":
            double quantidadeDeCarnesKiloFile = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de file duplo:"));
                if (quantidadeDeCarnesKiloFile <= 5){
                    double totalFile = quantidadeDeCarnesKiloFile * 4.90;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                         precoFileTabajara = totalFile - 0.1;
                    }else{
                        precoFileTabajara = totalFile;
                    }
                    System.out.println("Total do preço do kilo dos filés até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesKiloFile + " Kg e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + precoFileTabajara);

                } else if (quantidadeDeCarnesKiloFile > 5) {
                    double totalFile2 = quantidadeDeCarnesKiloFile * 5.80;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        precoFileTabajara = totalFile2 - 0.1;
                    }else{
                        precoFileTabajara = totalFile2;
                    }
                    System.out.println("Total do preço do kilo dos filés acima de 5 Kg, a quantidade de filés é " + quantidadeDeCarnesKiloFile + " e o tipo do pagamento foi " + tipoDePagamento + " Kg e o valor a ser pago é de R$ : " + precoFileTabajara);
                }

                break;

            case "alcatra":
                double quantidadeDeCarnesAlcatra = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de alcatra:"));
                if (quantidadeDeCarnesAlcatra <= 5){
                    double totalAlcatra = quantidadeDeCarnesAlcatra * 5.90;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        precoAlcataraTabajara = totalAlcatra - 0.1;
                    }else{
                        precoAlcataraTabajara = totalAlcatra;
                    }
                    System.out.println("Total do preço do kilo da alcatra até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesAlcatra + " Kg e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + precoAlcataraTabajara);
                }

                if (quantidadeDeCarnesAlcatra > 5){
                    double total2 = quantidadeDeCarnesAlcatra * 5.80;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        precoAlcataraTabajara = total2 - 0.1;
                    }else{
                        precoAlcataraTabajara = total2;
                    }
                    System.out.println("Total do preço do kilo da alcatra acima de 5 Kg, a quantidade de filés é " + quantidadeDeCarnesAlcatra + " e o tipo do pagamento foi " + tipoDePagamento + " Kg e o valor a ser pago é de R$ : " + precoAlcataraTabajara);
                }

                break;

            case "picanha":
                double quantidadeDeCarnesPicanha = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em Kilo de carnes de picanha:"));
                if (quantidadeDeCarnesPicanha <= 5){
                    double totalPicanha = quantidadeDeCarnesPicanha * 6.90;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        precoPicanhaTabajara = totalPicanha - 0.1;
                    }else{
                        precoPicanhaTabajara = totalPicanha;
                    }
                    System.out.println("Total do preço do kilo da picanha até 5 Kg, a quantidade de filés é " + quantidadeDeCarnesPicanha + " Kg e o tipo do pagamento foi " + tipoDePagamento + " e o valor a ser pago é de R$ : " + precoPicanhaTabajara);
                }

                if (quantidadeDeCarnesPicanha > 5){
                    double totalPic2 = quantidadeDeCarnesPicanha * 7.80;
                    tipoDePagamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento: (Cartão tabajara 10 %)");
                    if (tipoDePagamento == "cartao tabajara"){
                        precoPicanhaTabajara = totalPic2 - 0.1;
                    }else{
                        precoPicanhaTabajara = totalPic2;
                    }
                    System.out.println("Total do preço do kilo da alcatra acima de 5 Kg, a quantidade de filés é " + quantidadeDeCarnesPicanha + " e o tipo do pagamento foi " + tipoDePagamento + " Kg e o valor a ser pago é de R$ : " + precoPicanhaTabajara);
                }
        }
    }
}
