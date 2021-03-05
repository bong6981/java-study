package practice.Pr14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pr14_4 {
    public static void main(String[] args) {
        Stream<Integer> die = IntStream.range(1,6).boxed();

        die.flatMap(i->Stream.of(1,2,3,4,5,6).map(j->new int[] {i, j}))
                .filter(arri -> arri[0] + arri[1] == 6)
                .forEach(arri -> System.out.println(Arrays.toString(arri)));
    }
}
