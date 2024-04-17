package br.edu.up.lista.classes;

public class Pessoa {

    private String nome;
    private char sexo;
    private int idade;
    private char saude;

    public Pessoa(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        return idade >= 18 && saude == 'S';
    }
}
