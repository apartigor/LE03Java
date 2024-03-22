package lista;

import java.util.Scanner;
import lista.classes.IntervaloDeNum;

public class Exercicio09 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int num[] = new int[80];
        int cont = 0;

        for (int i = 0; i < num.length; i++){
            System.out.printf("Digite o %d(º) número: ", i + 1);
            num[i] = ler.nextInt();
        }

        IntervaloDeNum objIntervalo = new IntervaloDeNum();

        int contador = objIntervalo.verificarnumeros(num, cont);

        System.out.printf("Há %d número(s) entre o intervalo de 10 (inclusive) e 150 (inclusive)", contador);



        ler.close();
    }

}
