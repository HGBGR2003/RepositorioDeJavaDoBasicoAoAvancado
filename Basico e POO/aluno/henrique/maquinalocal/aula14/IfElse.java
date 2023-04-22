package aluno.henrique.maquinalocal.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

        //System.out.println("Entre com sua idade :");
        //int idade = impressora.nextInt();


        /*if (idade >= 18){
            System.out.println("É maior de Idade.");
        }else{
            System.out.println("Não é maior de Idade");
        }*/

        System.out.println("Entre com o preço do item:");
        double valor = impressora.nextDouble();

        System.out.println("--------------------------");

        if (valor <= 10){
            System.out.println("Está barato, pode comprar");
            System.out.println("--------------------------");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
            System.out.println("--------------------------");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
            System.out.println("--------------------------");
        } else { // valor >= 17
            System.out.println("Muito caro");
        }

    }
}
