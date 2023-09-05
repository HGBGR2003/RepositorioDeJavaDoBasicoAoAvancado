package aluno.henrique.exerciciosdecasa.lista.aula17;

public class ex4 {
    public static void main(String[] args) {
        double numeroHabitanteA = 80000;
        double numeroHabitanteB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;

        while (numeroHabitanteA <= numeroHabitanteB){
            numeroHabitanteA += (numeroHabitanteA * taxaA);
            numeroHabitanteB += (numeroHabitanteB * taxaB);
            anos++;
        }
        System.out.println("Número de anos necessários para A ultrapassar B: " + anos);
    }
}
