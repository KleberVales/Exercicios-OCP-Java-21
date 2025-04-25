package javaIO;

/*
    O objetivo do exercicio é
    listar todos os arquivos de um diretório usando Files e Path.
 */


import java.nio.file.*;

public class NIO2ListarArquivos {

    public static void main(String[] args) {
        Path diretorio = Paths.get("src");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)){

            for(Path arquivo : stream){
                System.out.println("Arquivo: "+arquivo.getFileName());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}