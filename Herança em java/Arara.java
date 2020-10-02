package heranca;

public class Arara extends Ave implements Pet {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void passear() {
        System.out.println("Voou um pouco e voltou!");
    }

    @Override
    public void veterinario() {
        System.out.println("Foi ao veterinario!");
    }

    @Override
    public void fazerSom() {
        System.out.println("Araaa! Araaa!");
    }
}
