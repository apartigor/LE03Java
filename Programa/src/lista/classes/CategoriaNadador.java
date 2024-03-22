package lista.classes;

public class CategoriaNadador {
        public int idade;
    
        public CategoriaNadador(int idade) {
            this.idade = idade;
        }
    
        public String classificarCategoria() {
            if (idade >= 5 && idade <= 7) {
                return "Infantil A";
            } else if (idade >= 8 && idade <= 10) {
                return "Infantil B";
            } else if (idade >= 11 && idade <= 13) {
                return "Juvenil A";
            } else if (idade >= 14 && idade <= 17) {
                return "Juvenil B";
            } else if (idade >= 18 && idade <= 25) {
                return "Sênior";
            } else {
                return "idade fora da faixa etária";
            }
        }
    }
    