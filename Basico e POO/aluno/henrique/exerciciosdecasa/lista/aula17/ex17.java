package aluno.henrique.exerciciosdecasa.lista.aula17;

import javax.swing.*;

public class ex17 {
    public static void main(String[] args) {
        String nomeUsuario;
        String senha;
        boolean resposta;

        nomeUsuario = JOptionPane.showInputDialog(null, "Digite seu nome de usuário");
        senha = JOptionPane.showInputDialog("Entre com a senha");

        do {
            if (senha.equals(nomeUsuario)) {
                JOptionPane.showMessageDialog(null, "Tente de Novo!");
                nomeUsuario = JOptionPane.showInputDialog(null, "Digite seu nome de usuário");
                senha = JOptionPane.showInputDialog("Entre com a senha");
                resposta = true;
            }

        } while (resposta = false);

        System.out.println("Nome de Usuário: " + nomeUsuario);
        System.out.println("Sua Senha: " + senha);


    }
}
