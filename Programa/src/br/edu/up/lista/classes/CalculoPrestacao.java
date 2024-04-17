package br.edu.up.lista.classes;

public class CalculoPrestacao {
    private double valor;

    public CalculoPrestacao(double valor) {
        this.valor = valor;
    }

    public double calcular_prestacoes(double valor) {
        return valor / 5;
    }

}
