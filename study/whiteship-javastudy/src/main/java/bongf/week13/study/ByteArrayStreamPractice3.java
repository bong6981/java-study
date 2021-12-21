package bongf.week13.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

// 자바의 정석 예제 (15-3)
public class ByteArrayStreamPractice3 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            while (input.available() > 0) {
                input.read(temp);
                output.write(temp);

                outSrc = output.toByteArray();
                System.out.println("++++++++++++++++++++++++++");
                System.out.println(Arrays.toString(temp));
                System.out.println(Arrays.toString(outSrc));

            }
        } catch (IOException e) {
        }

    }
}
