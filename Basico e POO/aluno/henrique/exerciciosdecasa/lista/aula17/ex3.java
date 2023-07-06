package aluno.henrique.exerciciosdecasa.lista.aula17;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        String nomeUsuario;
        int idade;
        double salario;
        String sexoHumano;
        String estadoCivil;

        System.out.println("Informe o seu nome:");
        nomeUsuario = imp.next();

        System.out.println("--------------------------");

        System.out.println("Entre com sua idade:");
        idade = imp.nextInt();

        System.out.println("--------------------------");

        System.out.println("Entre com seu sálario:");
        salario = imp.nextDouble();

        System.out.println("--------------------------");

        System.out.println("Entre com seu sexo (F/M) :");
        sexoHumano = imp.next();

        System.out.println("--------------------------");

        System.out.println("Entre com seu estado civil:(S/C/V/D)");
        estadoCivil = imp.next();

        System.out.println("--------------------------");

        while (nomeUsuario.length() > 3){
            System.out.println("Informe o nome de novo:");
            nomeUsuario = imp.next();
            System.out.println("--------------------------");
        }

        while (idade < 0 || idade > 150){
            System.out.println("Informe sua idade de novo:");
            idade = imp.nextInt();
            System.out.println("--------------------------");
        }

        while (salario <= 0){
            System.out.println("Entre com um salario maior:");
            salario = imp.nextDouble();
            System.out.println("--------------------------");
        }

        while (!sexoHumano.equalsIgnoreCase("f") && !sexoHumano.equalsIgnoreCase("m")){
            System.out.println("Entre com um sexo correto (F/M)");
            sexoHumano = imp.next();
            System.out.println("--------------------------");
        }

        while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
        && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Entre com seu estado civil seguindo essa nomiação: [S/C/V/D] ");
            estadoCivil = imp.next();
            System.out.println("--------------------------");
        }

        System.out.println("Sucesso!");
    }
}
