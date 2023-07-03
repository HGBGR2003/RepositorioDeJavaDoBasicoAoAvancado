package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        double produto1;
        double produto2;
        double produto3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do produto 1:");
        produto1 = scan.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Informe o preço do produto 2:");
        produto2 = scan.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Informe o preço do produto 3:");
        produto3 = scan.nextDouble();
        System.out.println("------------------------------");

        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("Compre o produto 1");
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Compre o produto 2");
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            System.out.println("Compre o produto 3");
        }


    }
}
