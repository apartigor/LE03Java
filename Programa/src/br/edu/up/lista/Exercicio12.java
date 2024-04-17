package br.edu.up.lista;

import java.util.Scanner;

import br.edu.up.lista.classes.CalculadoraDesconto;

public class Exercicio12 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        CalculadoraDesconto objCalculadora = new CalculadoraDesconto();

        char continuar;
        do {
            System.out.print("Digite o ano do veículo: ");
            int ano = ler.nextInt();
            System.out.print("Digite o valor do veículo: ");
            double valor = ler.nextDouble();

            objCalculadora.calcularDesconto(ano, valor);

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = ler.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        objCalculadora.exibirTotais();
        ler.close();
    }

}
