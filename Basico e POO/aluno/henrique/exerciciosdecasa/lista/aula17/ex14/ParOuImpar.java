package aluno.henrique.exerciciosdecasa.lista.aula17.ex14;

public class ParOuImpar {
    public void Par(int numero){

        int contadorPar = 0;
        int contadorImpar = 0;

        if (numero % 2 == 0){
            contadorPar++;
            System.out.println("A quantidade de números pares é " + contadorPar);
        }else{
            contadorImpar++;
            System.out.println("A quantidade de números impares é " + contadorImpar);
        }

    }
}
