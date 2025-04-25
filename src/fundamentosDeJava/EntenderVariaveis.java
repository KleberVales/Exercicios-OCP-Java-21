package fundamentosDeJava;

public class EntenderVariaveis {
    // Variável de classe (estática) — compartilhada entre todas as instâncias
    static int contadorContas = 0;

    // Variável de instância — pertence a cada objeto
    double saldo;

    public EntenderVariaveis(double saldoInicial) {
        saldo = saldoInicial;
        contadorContas++; // Incrementa cada vez que uma nova conta é criada
    }

    public void sacar(double valor) {
        // Variável local — existe só dentro desse método
        if (valor <= saldo) {
            double novoSaldo = saldo - valor;
            saldo = novoSaldo;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        EntenderVariaveis conta1 = new EntenderVariaveis(1000.0);
        EntenderVariaveis conta2 = new EntenderVariaveis(500.0);

        conta1.sacar(200.0);
        conta1.mostrarSaldo(); // Saldo: R$800.0

        conta2.sacar(100.0);
        conta2.mostrarSaldo(); // Saldo: R$400.0

        // Acessando a variável estática diretamente pela classe
        System.out.println("Total de contas criadas: " + EntenderVariaveis.contadorContas); // 2
    }
}
