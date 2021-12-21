package practice.Pr6;

import java.util.Arrays;

public class Pr6_20 {
    private static int max(int[] data) {
        if (data == null || data.length == 0){
            return -999999;
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println(max(data));
        System.out.println(max(null));
        System.out.println(max(new int[] {}));

    }
}
