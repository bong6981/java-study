package bongf.week13.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        // file 경로로 fileInputStream,outputStream을 생성한다
        FileInputStream fileToIn = new FileInputStream("c:\\java2\\file_practice\\test.txt");
        FileOutputStream fileToOut = new FileOutputStream("c:\\java2\\file_practice\\fileout.txt", true);

        int data = 0;
        while ((data = fileToIn.read()) != -1) {
            fileToOut.write(data);
        }
        fileToIn.close();
        fileToOut.close();
    }
}
