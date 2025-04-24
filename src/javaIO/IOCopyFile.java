package javaIO;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IOCopyFile {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("entrada.txt");
            FileChannel channel = fis.getChannel()){

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (channel.read(buffer) > 0){

                buffer.flip();
                while (buffer.hasRemaining()){
                    System.out.print((char)buffer.get());
                }
                buffer.clear();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}