package EntradaESaida;

import java.io.*;

public class IOCopyFile {

    public static void main(String[] args) {
        File entrada = new File("entrada.txt");
        File saida = new File("saida.txt");

        try(BufferedReader read = new BufferedReader(new FileReader(entrada));
            BufferedWriter write = new BufferedWriter(new FileWriter(saida))){

            String linha;

            while((linha = read.readLine()) != null){

                write.write(linha);
                write.newLine();
            }

            System.out.println("Copiado com sucesso.");

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}