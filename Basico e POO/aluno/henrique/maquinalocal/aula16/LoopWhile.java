package aluno.henrique.maquinalocal.aula16;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println("O valor de i: é " + i);
            i++;
        }
        System.out.println(i);
    }
}
