package coreApps;

// Superclasse
class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Subclasse
class Estudante extends Pessoa {
    String curso;

    Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }
}

// Teste
public class TesteHeranca {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Lucas", 20, "Engenharia");
        estudante.apresentar();  // método herdado
        estudante.estudar();     // método da subclasse
    }
}
