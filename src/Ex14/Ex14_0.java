package Ex14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {
    public static void main(String[] args) {

//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println(arr.length);

        Optional<String> opt = Optional.empty();
        System.out.println(opt);
//        System.out.println(opt.get());

        String str = "";
        str = opt.orElse("");
        System.out.println(str);


    }
}