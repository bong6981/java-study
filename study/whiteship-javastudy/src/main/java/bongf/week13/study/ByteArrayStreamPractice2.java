package bongf.week13.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// 자바의 정석 예제 (15-1)
public class ByteArrayStreamPractice2 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length); // 읽어온 데이터를 temp 배열에 담는다
        output.write(temp, 4, 6); //temp[4]부터 6개의 데이터를 write

        outSrc = output.toByteArray();
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(outSrc));

    }
}
