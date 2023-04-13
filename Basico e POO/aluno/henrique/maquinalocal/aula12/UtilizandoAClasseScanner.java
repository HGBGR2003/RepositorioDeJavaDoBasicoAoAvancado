package aluno.henrique.maquinalocal.aula12;
import java.util.Scanner;
public class UtilizandoAClasseScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se possui bichinhos?");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte quantidadeDeFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de Filhos: " + quantidadeDeFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem algum pet em casa? " + temPet);

    }
}
