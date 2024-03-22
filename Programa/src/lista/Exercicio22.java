package lista;

import java.util.Scanner;
import lista.classes.ContaLuz;

public class Exercicio22 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (residência, comércio ou indústria): ");
        String tipoCliente = ler.nextLine();

        System.out.println("Informe o consumo de kWh: ");
        int consumoKWh = ler.nextInt();

        ContaLuz contaLuz = new ContaLuz(tipoCliente);
        double valorConta = contaLuz.calcularValorConta(consumoKWh);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        ler.close();
    }
}