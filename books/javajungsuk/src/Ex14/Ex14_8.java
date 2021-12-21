package Ex14;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {
    public static void main(String[] args) {
        Optional<String> opStr = Optional.of("abcde");
        Optional<Integer> opInt = opStr.map(String::length);
        System.out.println("optStr = " + opStr.get());
        System.out.println("optInt = " + opInt.get());

        int rusult1 = Optional.of("123")
                .filter(x->x.length() > 0)
                .map(Integer::parseInt).get();

        int rusult2 = Optional.of("")
                .filter(x->x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 =" + rusult1);
        System.out.println("result12 =" + rusult2 );

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x-> System.out.printf("result3=%d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());

        System.out.println(optInt1.getAsInt());
//        System.out.println(optInt2.getAsInt());
        System.out.println("optInt1 ="+optInt1);
        System.out.println("optInt1 ="+optInt2);
        System.out.println(optInt1.equals(optInt2));








    }
}
