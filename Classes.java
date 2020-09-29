package Java.Basico.GNS;

import java.util.Scanner;

class Pessoa {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void verificarIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Error! Idade invalida! Foi formatada automaticamente para 0.");
            this.idade = 0;
        } else if (idade < 13) {
            System.out.println("Voce e uma crianca.");
        } else if (idade >= 13 && idade <18) {
            System.out.println("Voce e um adolecente.");
        } else {
            System.out.println("Voce e velho.");
        }
    }

}

public class Classes {

    public static Pessoa ps = new Pessoa();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Coloque a idade: ");
        ps.setIdade(sc.nextInt());
        ps.verificarIdade(ps.getIdade());

    }
}
