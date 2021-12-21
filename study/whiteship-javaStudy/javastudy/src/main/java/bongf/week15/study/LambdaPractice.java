package bongf.week15.study;

import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        functionalInterfacePractice1();

        Predicate<Integer> p = x -> x >0;
        functionalInterfaceParameter(p);
        functionalInterfaceParameter(x-> x>0);
    }

    private static Predicate<Integer> returnFunctionalInterface() {
        return x -> x == 1;
    }

    private static void functionalInterfaceParameter(Predicate<Integer> predicate) {
        System.out.println(predicate.test(3));
    }

    private static void functionalInterfacePractice2() {
        Predicate<Integer> cb = a -> a > 0;
    }

    private static void functionalInterfacePractice1() {
        Predicate<Integer> cb = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        boolean isPositive = cb.test(14);
        System.out.println(isPositive); //true
    }

    private static void methodReference() {
        int[] test = new int[]{1, 2, 3};
        Arrays.stream(test).forEach(System.out::println);
    }

}


