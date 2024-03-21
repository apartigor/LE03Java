package lista;

import java.util.Scanner;
import lista.classes.PercentualParaVendaCarro;

public class Exercicio07 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Preço de Custo de Fábrica: ");
        double valorcusto = ler.nextDouble();
        double valorcustoimposto = 0;

        PercentualParaVendaCarro objPerc = new PercentualParaVendaCarro();

        double valorvenda = objPerc.calcular_percentual(valorcustoimposto, valorcusto);

        System.out.printf("Preço de Venda: R$%.2f", valorvenda);

        ler.close();
    }

}
