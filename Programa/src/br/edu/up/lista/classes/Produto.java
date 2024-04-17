package br.edu.up.lista.classes;

public class Produto {
    public double precoCusto;
    public double precoVenda;

    public Produto(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String calcularLucroOuPrejuizo() {
        double diferenca = precoVenda - precoCusto;
        if (diferenca > 0) {
            return "Lucro";
        } else if (diferenca < 0) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}