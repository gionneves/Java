package Animais;

public class Cachorro extends Mamifero implements Pet{

    public String raca;
    public int idade;

    public Cachorro(String nome){
        setNome(nome);
    }

    @Override
    public void passear() {
        System.out.println("Levar no carro");
    }
}
