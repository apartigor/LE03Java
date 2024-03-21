package lista;

import java.util.Scanner;
import lista.classes.IntervaloDeNums;

public class Exercicio09 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int num[] = new int[5];
        int cont = 0;

        for (int i = 0; i < num.length; i++){
            System.out.printf("Digite o %d(º) número: ", i + 1);
            num[i] = ler.nextInt();
        }

        IntervaloDeNums objIntervalo = new IntervaloDeNums();

        int contador = objIntervalo.verificarnumeros(num, cont);

        System.out.printf("Há %d número(s) entre o intervalo de 10 (inclusive) e 150 (inclusive)", contador);



        ler.close();
    }

}
