package br.edu.up.lista;

import br.edu.up.lista.classes.Funcionario;


public class Exercicio16 {
    public static void executar() {
            int totalFunc = 584;
            Funcionario[] funcionarios = new Funcionario[totalFunc];
    
            double totalReajuste = 0;
            double totalSalarioFinal = 0;
    
            for (int i = 0; i < totalFunc; i++) {
                double salario = 1000;
                funcionarios[i] = new Funcionario(salario);
                totalReajuste += funcionarios[i].calcularReajuste();
                totalSalarioFinal += funcionarios[i].calcularSalarioFinal();
            }
    
            System.out.printf("Total de reajustes a serem pagos: R$ %.2f%n", totalReajuste);
            System.out.printf("Total a ser pago aos funcionários: R$ %.2f%n", totalSalarioFinal);
    }
}
    