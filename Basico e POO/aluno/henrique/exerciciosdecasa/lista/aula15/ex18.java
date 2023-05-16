package aluno.henrique.exerciciosdecasa.lista.aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Entre com uma data no formato dd/mm/aaaa");
        String data = imprimir.nextLine();

        SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
        formatoDeData.setLenient(false);

        try {
            Date dataCorreta = formatoDeData.parse(data);
            System.out.println("A data é valida");
        }catch (ParseException e){
            System.out.println("A data é inválida");
        }
    }
}
