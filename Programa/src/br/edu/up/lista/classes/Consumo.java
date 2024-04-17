package br.edu.up.lista.classes;

public class Consumo {
    private double distanciaTotal;
    private double combustivelGasto;

    public Consumo(double distanciaTotal, double combustivelGasto) {
        this.distanciaTotal = distanciaTotal;
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        return distanciaTotal / combustivelGasto;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }
}