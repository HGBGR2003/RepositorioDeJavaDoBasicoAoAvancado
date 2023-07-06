package aluno.henrique.exerciciosdecasa.lista.aula17;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String nomeUsuario;
        String senha;
        Scanner sfc = new Scanner(System.in);

        System.out.println("Entre com o nome de Usuário:");
        nomeUsuario = sfc.next();

        System.out.println("Entre com a senha de Usuário");
        senha = sfc.next();

        while (senha.equals(nomeUsuario)){
            System.out.println("Entre denovo com a senha: (Informação Incorreta)");
            senha = sfc.next();

            System.out.println("Entre com seu nome denovo por favor:");
            nomeUsuario = sfc.next();
        }

        System.out.println("Passou");



    }
}
