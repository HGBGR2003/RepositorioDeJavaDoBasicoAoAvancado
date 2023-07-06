package aluno.henrique.maquinalocal.aula17;

public class UsandoPara {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("i tem valor: " + i);
        }

        System.out.println("------------------------------");

        for (int i = 5; i > 0; i--){
            System.out.println("i tem valor: " + i);
        }

        System.out.println("-------------------------------------");

        //Outro jeito (Novo com duas variaveis) <= Ps: Nunca vi isso.
        for (int i = 0, k = 10; i < k; i++, k--){
            System.out.println("i = " + i + "; k = " + k);
        }

        System.out.println("-------------------------------------------");

        int count = 0;

        for (; count < 10 ;){
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        System.out.println("----------------------------------");

        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("Valor de cont: " + cont);
        }

        System.out.println("------------------------------");

        //Exemplo sem a as chaves e com as chaves.
        int soma = 0;
        for (int i = 0; i < 5; soma += i++);
        System.out.println("O valor da soma é " + soma);

        System.out.println("---------------------------------");

        for (int i =  0; i < 5; i++){
            System.out.println("i tem valor: " + i);
            System.out.println("i tem valor: ");
        }
    }
}
