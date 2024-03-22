package lista;

import java.util.Scanner;
import lista.classes.Seguro;

public class Exercicio26 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente: ");
        String nome = ler.nextLine();

        System.out.println("Digite a idade do pretendente: ");
        int idade = ler.nextInt();

        ler.nextLine();

        System.out.println("Digite o grupo de rilero do pretendente (baixo, médio ou alto): ");
        String grupoRilero = ler.nextLine();

        Seguro seguro = new Seguro(nome, idade, grupoRilero);
        String categoria = seguro.determinarCategoria();

        System.out.println("Nome: " + seguro.getNome());
        System.out.println("Idade: " + seguro.getIdade());
        System.out.println("Grupo de Rilero: " + seguro.getGrupoRisco());
        System.out.println("Categoria: " + categoria);

        ler.close();
    }
}