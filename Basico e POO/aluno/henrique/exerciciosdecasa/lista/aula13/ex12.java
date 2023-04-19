package aluno.henrique.exerciciosdecasa.lista.aula13;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        double alturaPessoa;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe sua altura ?");
        alturaPessoa = impressora.nextDouble();

        double formulaDoPesoIdeal = (72.2 * alturaPessoa) - 58;
        BigDecimal valorDecimal = new BigDecimal(formulaDoPesoIdeal);
        valorDecimal = valorDecimal.setScale(1, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        System.out.println("O seu peso ideal é " + valorFormula);

    }
}
