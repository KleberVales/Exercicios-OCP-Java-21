package fundamentosDeJava;

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Pessoa " + nome + " criada.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pessoa " + nome + " destruída.");
    }
}

public class DestruirObjeto {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");

        // Tornando o objeto elegível para o garbage collector
        p1 = null;

        // Solicitando a coleta de lixo
        System.gc();

        // Aguardando um pouco para dar tempo do GC agir
        try {
            Thread.sleep(1000); // Espera 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
