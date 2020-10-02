package heranca;

public class Cachorro extends Mamifero implements Pet {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }

    @Override
    public void passear() {
        System.out.println("Foi passear!");
    }

    @Override
    public void veterinario() {
        System.out.println("Levado ao veterinario!");
    }
}
