package aluno.henrique.maquinalocal.aula19;

public class AulaVetores {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        /*Forma comum, mas não utilizado por se tratar de codigo limitado!*/
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        /*
        System.out.println(temperaturas[0]);
        System.out.println(temperaturas[1]);
        System.out.println(temperaturas[2]);
        System.out.println(temperaturas[3]);
        System.out.println(temperaturas[4]);
        * */

       /* for (int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }*/

        for (double temp: temperaturas){
            System.out.println(temp);

        }

    }
}
