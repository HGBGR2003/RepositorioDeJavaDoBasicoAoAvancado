package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        double alturaPessoaSexo;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe sua altura ?");
        alturaPessoaSexo = impressora.nextDouble();

        System.out.println("------------------------------------");

        double formulaParaHomens = 72.2 * alturaPessoaSexo - 58;
        double formulaParaMulheres = 62.1 * alturaPessoaSexo - 44.7;

        //Para Homems
        BigDecimal valorDecimal = new BigDecimal(formulaParaHomens);
        valorDecimal = valorDecimal.setScale(1, RoundingMode.HALF_UP);
        double valorFormula = valorDecimal.doubleValue();

        //Para Mulheres
        BigDecimal valor = new BigDecimal(formulaParaMulheres);
        valor = valor.setScale(1, RoundingMode.HALF_UP);
        double valorFormulaParaMulheres = valor.doubleValue();

        System.out.println("O peso ideal para os homens é " + valorFormula);
        System.out.println("------------------------------------");
        System.out.println("O peso ideal para as mulheres é " + valorFormulaParaMulheres);
    }
}
