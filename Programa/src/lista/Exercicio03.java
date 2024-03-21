package lista;

import java.util.Scanner;
import lista.classes.Vendedor;

public class Exercicio03 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite seu Salário Fixo: ");
        double salar_fix = ler.nextDouble();
        System.out.println("Digite o total de vendas do mês: ");
        double totalvendas = ler.nextDouble();

        Vendedor objVend = new Vendedor(nome, salar_fix, totalvendas);

        double salar_final = objVend.calcular_salario(salar_fix, totalvendas);
        System.out.printf("Seu sálario final sera de R$%.2f", salar_final);

        ler.close();
    }

}
