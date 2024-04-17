package br.edu.up.lista.classes;

public class PercentualParaVenda {
    private double valorcusto;
    private double perc;


    public PercentualParaVenda(double valorcusto, double perc){
        this.valorcusto = valorcusto;
        this.perc = perc;
    }

    public double calcular_percentual(double valorcusto, double perc){
        return valorcusto * (1 + (perc / 100));
    }

}
