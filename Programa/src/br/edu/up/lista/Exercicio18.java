package br.edu.up.lista;

import java.util.Scanner;

import br.edu.up.lista.classes.ReajusteSexo;

public class Exercicio18 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = ler.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = ler.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = ler.next().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = ler.nextDouble();

        ReajusteSexo reajusteSexo = new ReajusteSexo(nome, idade, sexo, salarioFixo);

        System.out.println("Nome: " + reajusteSexo.Nome());
        System.out.println("Abono: R$ " + reajusteSexo.Abono());
        System.out.println("Salário Líquido: R$ " + reajusteSexo.calcularSalarioLiquido());

        ler.close();
    }
}