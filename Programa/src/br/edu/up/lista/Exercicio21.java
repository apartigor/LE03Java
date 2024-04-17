package br.edu.up.lista;

import java.util.Scanner;

import br.edu.up.lista.classes.CategoriaNadador;
public class Exercicio21 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade do nadador para ver a categoria: ");
        int idade = ler.nextInt();

        CategoriaNadador categoriaNadador = new CategoriaNadador(idade);
        String categoria = categoriaNadador.classificarCategoria();

        System.out.println("O nadador está na categoria:" + categoria);

        ler.close();
    }
}