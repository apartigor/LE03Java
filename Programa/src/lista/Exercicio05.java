package lista;

import java.util.Scanner;
import lista.classes.*;

public class Exercicio05 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Loja Mamão com Açúcar");
        System.out.println("---------------------------------------------------");
        System.out.println("Valor da Compra: ");
        double valor = ler.nextDouble();

        double valor_final = calcular_prestacoes(valor);
        System.out.printf("Valor de cada prestação sera R$%.2f", valor_final);

        ler.close();
    }

    public static double calcular_prestacoes(double valor){
        return valor / 5;
    }

}