package aluno.henrique.maquinalocal.aula12;
import java.util.Scanner;
public class UtilizandoAClasseScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("O seu nome completo é " +nomeCompleto);

        //Usando o Next
        System.out.println("Digite seu primeiro nome ?");
        String primeiroNome = scan.next();
        System.out.println("O seu primeiro nome é " + primeiroNome);

    }
}
