package heranca;

public class Gavivao extends Ave implements Selvagem {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void fazerSom() {
        System.out.println("Fiwaaaa");
    }

    @Override
    public void cacar() {
        System.out.println("Caçou e comeu!");
    }
}
