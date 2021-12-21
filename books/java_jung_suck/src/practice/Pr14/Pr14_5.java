package practice.Pr14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Pr14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd"};
        int result = Arrays.stream(strArr)
                .map(String::length)
                .reduce(0, (a,b)-> (a+b));
        int resultoo = Stream.of(strArr)
                .mapToInt(String::length)
                .sum();
        System.out.println(result);
        System.out.println(resultoo);
    }
}
