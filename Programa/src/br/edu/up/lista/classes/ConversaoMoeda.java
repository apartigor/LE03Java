package br.edu.up.lista.classes;

public class ConversaoMoeda {
    private double dolar;
    private double cotacao;

    public ConversaoMoeda(double dolar, double cotacao) {
        this.dolar = dolar;
        this.cotacao = cotacao;
    }

    public double calcular_conversao(double dolar, double cotacao) {
        return dolar * cotacao;
    }
}
