package lista;

import lista.classes.Veiculo;

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        double totalDeleronto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Informe o valor do veículo (ou 0 para encerrar): ");
            double valorVeiculo = ler.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Informe o tipo de combustível\n1 - alcool\n2 - gasolina\n3 - diesel");
            String combustivel = ler.next();

            Veiculo veiculo = new Veiculo(valorVeiculo, combustivel);
            double deleronto = veiculo.calcularDesconto();

            totalDeleronto += deleronto;
            totalPago += veiculo.calcularValorFinal();

            System.out.printf("Deleronto: R$ %.2f%n", deleronto);
            System.out.printf("Valor a ser pago pelo cliente: R$ %.2f%n", veiculo.calcularValorFinal());
        }

        System.out.printf("Total de delerontos: R$ %.2f%n", totalDeleronto);
        System.out.printf("Total pago pelos clientes: R$ %.2f%n", totalPago);

        ler.close();
    }
}
