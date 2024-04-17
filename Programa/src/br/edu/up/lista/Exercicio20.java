package br.edu.up.lista;
import java.util.Scanner;

import br.edu.up.lista.classes.SalarioProfessor;

public class Exercicio20 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nível do professor (1, 2 ou 3): ");
        int nivel = ler.nextInt();

        System.out.println("Informe a quantidade de horas/aula dadas: ");
        int horasAula = ler.nextInt();

        SalarioProfessor salarProfessor = new SalarioProfessor(nivel);
        double salario = salarProfessor.calcularSalario(horasAula);

        System.out.println("O salário do professor é: R$" + salario);

        ler.close();
    }
}
