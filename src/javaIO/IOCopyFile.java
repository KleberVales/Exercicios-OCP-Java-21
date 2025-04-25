package javaIO;

/*
O objetivo do programa é
ler um arquivo de texto e copiar seu
conteúdo para outro arquivo usando FileReader e FileWriter.
 */

import java.io.*;

public class IOCopyFile {

    public static void main(String[] args) {
        File origem = new File("entrada.txt");
        File destino = new File("saida.txt");

        try(BufferedReader reader = new BufferedReader(new FileReader(origem));
        BufferedWriter write = new BufferedWriter(new FileWriter(destino))){

            String linha;
            while((linha = reader.readLine()) != null){
                write.write(linha);
                write.newLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Arquivo copiado com sucesso");

    }
}
