package lista;

import java.util.Scanner;
import lista.classes.ConversaoMoeda;

public class Exercicio04 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a cotação do Dólar: ");
        double cotacao = ler.nextDouble();
        System.out.println("Digite quantos doláres voce tem: ");
        double dolar = ler.nextDouble();

        ConversaoMoeda objConversao = new ConversaoMoeda(dolar, cotacao);

        double real = objConversao.calcular_conversao(dolar, cotacao);
        System.out.printf("Você tem em REAIS: %.2f", real);

        ler.close();
    }

}
