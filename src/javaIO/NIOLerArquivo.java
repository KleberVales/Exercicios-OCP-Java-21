package javaIO;

/*
    O objetivo do exercicio é ler o conteúdo de um arquivo como
    blocos de bytes usando FileChannel e ByteBuffer.
 */

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOLerArquivo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("entrada.txt");
            FileChannel channel = fis.getChannel()){

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(channel.read(buffer)>0){
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.print((char)buffer.get());
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}