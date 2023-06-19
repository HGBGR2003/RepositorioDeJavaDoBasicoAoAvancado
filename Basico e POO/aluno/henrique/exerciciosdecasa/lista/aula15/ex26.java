package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        int gasAl = 0;
        double quantidadeLitroDeAlcoolComprado = 1.90;
        double quantidadeLitroDeGasolinaComprado = 2.50;
        double litrosAlcool = 0;
        double litrosGasolina = 0;
        double descontoAlcool = 0;
        double descontoGasolina = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Gasolina ou Alcool (1 OU 2):");
        gasAl = scan.nextInt();
        System.out.println("-----------------------------------------");


        switch (gasAl){
            case 1:
                System.out.println("Entre com a quantidade de litros de gasolina que o cliente pediu:");
                litrosGasolina = scan.nextDouble();
                System.out.println("-------------------------------------------------------------------");
                break;

            case 2:
                System.out.println("Entre com a quantidade de litros de alcool que o cliente pediu:");
                litrosAlcool = scan.nextDouble();
                System.out.println("-------------------------------------------------------------------");
                break;

            default:
                System.out.println("Informação Inválida");
        }

        //Gasolina
        if (litrosGasolina != 0){
            if (litrosGasolina <= 20){
                descontoGasolina = quantidadeLitroDeGasolinaComprado - 0.04;
                double totalCompradoGasolina = descontoGasolina * litrosGasolina;
                System.out.println("De "  + litrosGasolina  + "L o preço a ser pago é de 4 % com o desconto : R$ "  + totalCompradoGasolina);
            } else if (litrosGasolina > 20) {
                descontoGasolina = litrosGasolina - 0.06;
                double totalCompradoGasolina1 = descontoGasolina * litrosGasolina;
                System.out.println("De "  + litrosGasolina  + "L o preço a ser pago é de 6 % com o desconto : R$ "  + totalCompradoGasolina1);
            }
        }


        //Alcool
        if (litrosAlcool != 0){
            if (litrosAlcool <= 20){
                descontoAlcool = quantidadeLitroDeAlcoolComprado - 0.03;
                double totalCompradoAlcool = litrosAlcool * descontoAlcool;
                System.out.println("De "  + litrosAlcool  + "L o preço a ser pago é de 3 % com o desconto : R$ "  + totalCompradoAlcool);
            } else if (litrosAlcool > 20) {
                double descontoAlcool1 = quantidadeLitroDeAlcoolComprado - 0.05;
                double totalCompradoAlcool1 = litrosAlcool * quantidadeLitroDeAlcoolComprado;
                System.out.println("De "  + litrosAlcool  + "L o preço a ser pago de 5 % com o desconto : R$ "  + totalCompradoAlcool1);
            }
        }


    }
}
