package br.edu.up.lista.classes;
import java.util.Scanner;

public class VerificadorSexo {

    public Scanner ler;

    public VerificadorSexo(Scanner ler) {
        this.ler = ler;
    }

    public int verificador_sexo() {
        System.out.printf("Digite seu sexo: \n1 - Masculino \n2 - Feminino\n");
        int opcao = ler.nextInt();
        ler.nextLine();

        return opcao;
    }
}
