package aluno.henrique.exerciciosdecasa.lista.aula17.ex13;

public class CalculoPotencia {
    public int calcularPotencia(int expoente, int base){
        if (expoente == 0){
            return 1;
        }

        int resultado = 1;

        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }
        return  resultado;
    }
}
