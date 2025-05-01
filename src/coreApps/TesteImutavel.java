package coreApps;

// Classe imutável
final class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Teste
public class TesteImutavel {
    public static void main(String[] args) {
        Produto p = new Produto("Teclado", 150.0);
        System.out.println("Produto: " + p.getNome() + ", Preço: R$" + p.getPreco());
        // Não há como alterar os valores após a criação do objeto
    }
}

