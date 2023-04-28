package aluno.henrique.exerciciosdecasa.lista.aula15;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        double[] numero1 = new double[4];
        Random random = new Random();
        double numeroAleatorio = random.nextInt(11);

        for (int i = 0; i < numero1.length; i++){
            numeroAleatorio--;
            numero1[i] = numeroAleatorio;
            System.out.println(numero1[i]);
        }


    }
}
