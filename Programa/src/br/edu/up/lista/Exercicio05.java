package br.edu.up.lista;

import java.util.Scanner;

import br.edu.up.lista.classes.CalculoPrestacao;

public class Exercicio05 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Loja Mamão com Açúcar");
        System.out.println("---------------------------------------------------");
        System.out.println("Valor da Compra: ");
        double valor = ler.nextDouble();

        CalculoPrestacao objCalculoPrestacao = new CalculoPrestacao(valor);

        double valor_final = objCalculoPrestacao.calcular_prestacoes(valor);
        System.out.printf("Valor de cada prestação(5x sem juros): R$%.2f", valor_final);

        ler.close();
    }

}
