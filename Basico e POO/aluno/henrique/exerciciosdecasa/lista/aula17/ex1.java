package aluno.henrique.exerciciosdecasa.lista.aula17;

import java.util.Scanner;

public class  ex1 {
    public static void main(String[] args) {
        int entradaUsuario;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe uma nota entre 0 e 10 ?");
        entradaUsuario = impressora.nextInt();

        while (entradaUsuario < 0 || entradaUsuario > 10){
            System.out.println("Entre de novo com uma nota entre 0 e 10:");
            entradaUsuario = impressora.nextInt();
        }

        if (entradaUsuario >= 0 && entradaUsuario <= 10){
            System.out.println("Informação nos Padrões estabelecidos.");
        }

    }
}
