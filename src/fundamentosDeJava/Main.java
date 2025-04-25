package fundamentosDeJava;

// Praticar a criação de objetos e o uso de variáveis.

class Carro {
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }

}
public class Main {
    public static void main(String[] args) {
        // Criando o primeiro objeto
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.ano = 2020;

        // Criando o segundo objeto
        Carro carro2 = new Carro();
        carro2.modelo = "Corolla";
        carro2.ano = 2022;

        // Exibindo informações dos carros
        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
