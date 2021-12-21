package bongf.week6.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalKeyWord {
    public static final int[] ints = new int[5];
    public static final List<Integer> integerList = new ArrayList<>();
    public static void main(String[] args) {
        ints[1] = 5;
        integerList.add(1);

        System.out.println(Arrays.toString(ints)); //[0, 5, 0, 0, 0]
        System.out.println(integerList); //[1]
    }
}
