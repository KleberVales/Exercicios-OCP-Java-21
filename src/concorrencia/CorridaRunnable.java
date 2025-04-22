package concorrencia;

// Criar uma corrida onde cada thread representa um corredor. Vence quem terminar primeiro.

public class CorridaRunnable implements Runnable {
    private String nome;

    public CorridaRunnable(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        int distancia = 100;
        for (int i = 0; i <= distancia; i += 10) {
            System.out.println(nome + " correu " + i + " metros.");
            try {
                Thread.sleep((int)(Math.random() * 500)); // tempo aleatório
            } catch (InterruptedException e) {
                System.out.println(nome + " tropeçou!");
            }
        }
        System.out.println(nome + " chegou!");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new CorridaRunnable("Corredor 1"));
        Thread t2 = new Thread(new CorridaRunnable("Corredor 2"));
        Thread t3 = new Thread(new CorridaRunnable("Corredor 3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
