package br.edu.up.lista;

import java.util.Scanner;

import br.edu.up.lista.classes.Estudante;

public class Exercicio25 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nome = ler.nextLine();

        System.out.println("Digite o número de matrícula do estudante: ");
        int numeroMatricula = ler.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = ler.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = ler.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = ler.nextDouble();

        Estudante estudante = new Estudante(nome, numeroMatricula, notaLaboratorio, notaSemestral, notaExameFinal);
        estudante.imprimirDados();

        ler.close();
    }
}