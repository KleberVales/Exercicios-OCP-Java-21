package EntradaESaida;

import java.io.*;

public class IOCopyFile {
    public static void main(String[] args) {
        File origem = new File("entrada.txt");
        File destino = new File("saida.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(origem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destino))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine();
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
