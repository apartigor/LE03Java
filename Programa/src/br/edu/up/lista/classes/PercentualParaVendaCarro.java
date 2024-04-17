package br.edu.up.lista.classes;

public class PercentualParaVendaCarro {

    private double valorcustoimposto;
    private double valorcusto;

    public PercentualParaVendaCarro(double valorcustoimposto, double valorcusto) {
        this.valorcustoimposto = valorcustoimposto;
        this.valorcusto = valorcusto;
    }

    public double calcular_percentual(double valorcustoimposto, double valorcusto) {
        return valorcustoimposto = (valorcusto * (1 + 0.45)) * (1 + 0.28);
    }

}
