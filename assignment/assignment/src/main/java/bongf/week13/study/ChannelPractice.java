package bongf.week13.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:\\java2\\file_practice\\test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\java2\\file_practice\\fileout.txt");

        ByteBuffer buffer = ByteBuffer.allocateDirect(20);
        FileChannel channelIn = fileInputStream.getChannel();
        FileChannel channelOut = fileOutputStream.getChannel();
        channelIn.read(buffer);

        buffer.flip();
        channelOut.write(buffer);
    }
}
