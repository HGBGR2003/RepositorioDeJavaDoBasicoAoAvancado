package aluno.henrique.exerciciosdecasa.lista.aula19;

import javax.swing.*;

public class exe4 {
    public static void main(String[] args) {
        double [] vetorPrincipal = new double[15];
        double [] vetorSecundario = new double[15];
        double respostasUsuario;
        double entradasDeValores;

        for (int i = 0; i < vetorPrincipal.length; i++){
            entradasDeValores = Integer.parseInt(JOptionPane.showInputDialog(" Entre com um valor inteiro: "));
            vetorPrincipal[i] = entradasDeValores;
            respostasUsuario = Math.sqrt(vetorPrincipal[i]);
            vetorSecundario[i] = respostasUsuario;
            //System.out.printf("Número Formatado: %.1f%n" , respostasUsuario); //%.1f%n6 formatação em decimal
            System.out.printf( " O valor do vetor A em raiz é de : " + vetorPrincipal[i] +  " - Resposta: %.1f%n" , vetorSecundario[i]);
        }
    }
}
