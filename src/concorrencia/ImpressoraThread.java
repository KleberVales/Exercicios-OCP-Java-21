package concorrencia;

// Criar uma classe que estenda Thread e simule acesso a um recurso compartilhado (por exemplo, uma impressora).

public class ImpressoraThread extends Thread {

    private String documento;

    public ImpressoraThread(String documento) {

        this.documento = documento;

    }

    @Override
    public void run() {
        System.out.println("Imprimindo: " + documento);

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println("Erro na impressão do documento " + documento);

        }
        System.out.println("Finalizado: " + documento);
    }

    public static void main(String[] args) {

        ImpressoraThread doc1 = new ImpressoraThread("Contrato.pdf");
        ImpressoraThread doc2 = new ImpressoraThread("Relatório.xlsx");

        doc1.start();
        doc2.start();

    }

}
