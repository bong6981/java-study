package practice.Pr14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Pr14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};
        int answer1 = Stream.of(strArr)
                .mapToInt(String::length)
                .max().getAsInt();

        int answer2 = Arrays.stream(strArr)
                .map(String::length)
                .reduce(0, (a, b) -> a > b ? a : b);

        Arrays.stream(strArr)
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(System.out::println);


        System.out.println(answer1);
        System.out.println(answer2);
    }
}
