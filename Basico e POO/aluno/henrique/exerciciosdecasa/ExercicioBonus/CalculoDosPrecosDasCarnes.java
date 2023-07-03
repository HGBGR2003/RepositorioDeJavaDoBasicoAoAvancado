package aluno.henrique.exerciciosdecasa.ExercicioBonus;

public class CalculoDosPrecosDasCarnes {

    double fileDuplo;
    double alcatra;
    double picanha;

    public void setFileDuplo(double fileDuplo) {
        this.fileDuplo = fileDuplo;
    }

    public void setAlcatra(double alcatra) {
        this.alcatra = alcatra;
    }

    public void setPicanha(double picanha) {
        this.picanha = picanha;
    }

    public double getFileDuplo() {
        return fileDuplo;
    }

    public double getAlcatra() {
        return alcatra;
    }

    public double getPicanha() {
        return picanha;
    }

    public double precoCarneMaiorQue5(String tipo){
       if (tipo.equals("file")){
           this.fileDuplo = 5.80;
           return fileDuplo;
       }

       if (tipo == "alcatra"){
           this.alcatra = 6.80;
           return alcatra;
       }

      if (tipo.equals("picanha")){
          this.picanha = 7.80;
          return picanha;
      }
        return precoCarneMaiorQue5(tipo);
    }

    public double precoCarneMenorQue5(String tipo){
        if (tipo.equals("file")){
            this.fileDuplo = 4.90;
            return fileDuplo;
        }

        if(tipo.equals("alcatra")){
            this.alcatra = 5.90;
            return alcatra;
        }

        if (tipo.equals("picanha")){
            this.picanha = 6.90;
            return picanha;
        }
        return precoCarneMenorQue5(tipo);
    }

    public void calculoPreco(double quantidadeDeKilos, String tipoCarne, String ehCartao) {
        double valorCarne = 0;

        if (quantidadeDeKilos <= 5) {
           valorCarne = precoCarneMenorQue5(tipoCarne);
        }

        if (quantidadeDeKilos > 5){
            valorCarne = precoCarneMenorQue5(tipoCarne);
        }

       double totalCarne = quantidadeDeKilos * valorCarne;
       double trucamento = Math.floor(totalCarne * 100)/100;

        if (ehCartao.equals("cartao")){
            trucamento = trucamento - 0.05;
        }

        if (quantidadeDeKilos <= 5){
            System.out.println("Total do preço do kilo do(a) " + tipoCarne +  " até 5 Kg, a quantidade de filés é " + quantidadeDeKilos + " Kg e o tipo do pagamento foi " + ehCartao + " Kg e o valor a ser pago é de R$ : " + trucamento);
        }

        if (quantidadeDeKilos > 5){
            System.out.println("Total do preço do kilo do(a) " + tipoCarne +  " acima de 5 Kg, a quantidade de filés é " + quantidadeDeKilos + " Kg e o tipo do pagamento foi " + ehCartao + " e o valor a ser pago é de R$ : " + trucamento);
        }

    }



}
