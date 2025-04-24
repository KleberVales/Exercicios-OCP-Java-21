package javaIO;

/*
    O objetivo do exercicio é listar todos os arquivos de um diretório usando Files e Path.
 */


import java.io.IOException;


import java.nio.file.*;

public class NIO2ListarArquivos {

    public static void main(String[] args) {

        Path dir = Paths.get("src");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){

            for (Path arquivo : stream){
                System.out.println("Arquivos: "+arquivo.getFileName());
            }

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}


