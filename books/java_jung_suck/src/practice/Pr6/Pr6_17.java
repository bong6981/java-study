package practice.Pr6;

import java.util.Arrays;

public class Pr6_17 {
    public static void main(String[] args) {
        int[] original = { 1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }

    private static int[] shuffle(int[] original) {
        for (int i = 0; i < original.length; i++) {
            int random = (int) (Math.random()*original.length);
            int temp = original[0];
            original[0] = original[random];
            original[random] = temp;

        }
        return original;
    }
}
