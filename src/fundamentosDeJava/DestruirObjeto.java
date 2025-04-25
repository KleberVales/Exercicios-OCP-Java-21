package fundamentosDeJava;

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Pessoa " + nome + " criada.");
    }

    protected void finalize() {
        System.out.println("Pessoa " + nome + " destruída.");
    }
}

public class DestruirObjeto {
}
