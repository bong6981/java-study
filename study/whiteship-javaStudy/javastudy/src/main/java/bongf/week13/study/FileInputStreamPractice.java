package bongf.week13.study;

import java.io.FileInputStream;
import java.io.IOException;

// 자바의 정석 예제 (15-4)
public class FileInputStreamPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
