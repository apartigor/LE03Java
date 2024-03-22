package lista.classes;
import java.util.Scanner;

public class Pessoa {

    public String nome;
    public char sexo;
    public int idade;
    public char saude;

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
