package aluno.henrique.maquinalocal.aula18;

import java.util.Scanner;

public class UsandoQuebrar {
    public static void main(String[] args) {
        Scanner impressora = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = impressora.nextInt();

        System.out.println("Entre com um limite");
        int max = impressora.nextInt();

        for (int i = num; i <= max; i++){
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}
