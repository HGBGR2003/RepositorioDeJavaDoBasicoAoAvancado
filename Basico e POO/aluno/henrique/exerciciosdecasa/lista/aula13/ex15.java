package aluno.henrique.exerciciosdecasa.lista.aula13;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        double numerosHorasTrabalhadas;
        double horasTrabalhadasMes;
        double resultado;
        Scanner impressora = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora ?");
        numerosHorasTrabalhadas = impressora.nextDouble();

        System.out.println("---------------------------------------");

        System.out.println("Informe o número de horas trabalhadas ?");
        horasTrabalhadasMes = impressora.nextDouble();

        resultado = numerosHorasTrabalhadas * horasTrabalhadasMes;

        System.out.println("-----------------------------------");

        System.out.println("O Sálario bruto: R$ " + resultado);

        System.out.println("-----------------------------------");

        double descontoRenda = resultado * 0.11;

        System.out.println("IR (11%): R$ " + descontoRenda);

        System.out.println("-----------------------------------");

        double descontoInss = resultado * 0.08;

        System.out.println("INSS (8%): R$ " + descontoInss);

        System.out.println("-----------------------------------");

        double descontoSindicato = resultado * 0.05;
        System.out.println("Sindicato (5%): R$ " + descontoSindicato);

        System.out.println("-------------------------------------------");

        double resultadoSobra = resultado - descontoRenda - descontoInss - descontoSindicato;

        System.out.println("O Sálario Liquido " + resultadoSobra);

    }
}
