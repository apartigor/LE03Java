package lista.classes;

public class ConversaoMoeda {
    public double dolar;
    public double cotacao;

    public ConversaoMoeda(double dolar, double cotacao) {
        this.dolar = dolar;
        this.cotacao = cotacao;
    }

    public double calcular_conversao(double dolar, double cotacao) {
        return dolar * cotacao;
    }
}
