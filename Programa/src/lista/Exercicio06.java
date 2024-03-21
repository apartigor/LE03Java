package lista;

import java.util.Scanner;
import lista.classes.PercentualParaVenda;

public class Exercicio06 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Preço de Custo: ");
        double valorcusto = ler.nextDouble();
        System.out.println("Acréscimo(em %) para Venda: ");
        double perc = ler.nextDouble();

        PercentualParaVenda objPerc = new PercentualParaVenda(valorcusto, perc);

        double valorvenda = objPerc.calcular_percentual(valorcusto, perc);
        System.out.printf("Preço de Venda: R$%.2f", valorvenda);

        ler.close();
    }


}
