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

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }

    }
}
