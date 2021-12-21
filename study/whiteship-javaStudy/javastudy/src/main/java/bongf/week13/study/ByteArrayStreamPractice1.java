package bongf.week13.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.util.Arrays;

// 자바의 정석 예제 (15-1)
public class ByteArrayStreamPractice1 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;
        while((data = input.read()) != -1)  {
            output.write(data);
        }

        outSrc = output.toByteArray();
        System.out.println(Arrays.toString(inSrc));
        System.out.println(Arrays.toString(outSrc));

        FileReader fileReader = null;
    }
}
