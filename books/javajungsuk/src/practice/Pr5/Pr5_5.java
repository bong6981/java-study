package practice.Pr5;

import java.util.Arrays;

public class Pr5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int temp = 0;

            temp = ballArr[0];
            ballArr[0] = ballArr[j];
            ballArr[j] = temp;

        }
        ball3 = Arrays.copyOf(ballArr,3);
        System.out.println( Arrays.toString(ball3));

        System.arraycopy(ballArr, 0, ball3, 0,3);
        System.out.println( Arrays.toString(ball3));

    }
}
