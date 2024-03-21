package lista.classes;

public class PercentualParaVenda {
    public double valorcusto;
    public double perc;


    public PercentualParaVenda(double valorcusto, double perc){
        this.valorcusto = valorcusto;
        this.perc = perc;
    }

    public double calcular_percentual(double valorcusto, double perc){
        return valorcusto * (1 + (perc / 100));
    }

}
