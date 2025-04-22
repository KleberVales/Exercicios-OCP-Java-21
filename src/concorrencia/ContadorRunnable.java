package concorrencia;

// Criar uma classe que conte de 1 a 5, com intervalo de 1 segundo entre os números.

public class ContadorRunnable implements Runnable {

    private String nome;

    public ContadorRunnable(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(nome + " Contando: " + i);
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println(nome + "Interrompida.");
            }
        }
        System.out.println(nome + "  Finalizada.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ContadorRunnable("Thread 1"));
        Thread t2 = new Thread(new ContadorRunnable("Thread 2"));

        t1.start();
        t2.start();
    }

}