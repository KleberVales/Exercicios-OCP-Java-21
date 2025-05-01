package coreApps;

abstract class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    abstract void emitirSom();
}

// Subclasse concreta
class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}

// Teste
public class TesteAbstrata {
    public static void main(String[] args) {
        Animal dog = new Cachorro("Rex");
        dog.emitirSom();
    }
}

