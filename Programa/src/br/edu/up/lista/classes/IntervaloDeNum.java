package br.edu.up.lista.classes;

public class IntervaloDeNum {

    private int num;
    private int cont;

    public IntervaloDeNum(int num, int cont) {
        this.num = num;
        this.cont = cont;
    }

    public int verificarnumeros(int[] num, int cont) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 10 && num[i] <= 150) {
                cont++;
            }
        }
        return cont;
    }
}
