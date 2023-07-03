package aluno.henrique.exerciciosdecasa.lista.aula15;


import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

        System.out.println("Telefonou para a vitima?");
        String resp1 = impressora.next();

        System.out.println("Esteve no local do crime?");
        String resp2 = impressora.next();

        System.out.println("Mora perto da vitima?");
        String resp3 = impressora.next();

        System.out.println("Já trabalhou com a vitima?");
        String resp4 = impressora.next();


        System.out.println("Devia para a vitima?");
        String resp5 = impressora.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp2.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp3.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp4.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp5.equalsIgnoreCase("S")){
            cont++;
        }

        if (cont == 2){
            System.out.println("Suspeita");
        }else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        }else if (cont == 5){
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }

    }
}
