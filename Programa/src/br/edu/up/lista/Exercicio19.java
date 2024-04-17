package br.edu.up.lista;
import java.util.Scanner;

import br.edu.up.lista.classes.Triangulo;
public class Exercicio19 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1 do triângulo:");
        int lado1 = ler.nextInt();

        System.out.println("Digite o comprimento do lado 2 do triângulo:");
        int lado2 = ler.nextInt();

        System.out.println("Digite o comprimento do lado 3 do triângulo:");
        int lado3 = ler.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.isValid()) {
            System.out.println("Os lados podem formar um triângulo do tipo " + triangulo.getType());
        } else {
            System.out.println("Os lados não podem formar um triângulo válido");
        }
        ler.close();
    }
}

