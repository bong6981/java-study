package bongf.study.random;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPractice {
    public static void main(String[] args) {
//        int i = ThreadLocalRandom.current().nextInt();
//        System.out.println(i);
//        int j = ThreadLocalRandom.current().nextInt();
//        System.out.println(j);
//        int k = ThreadLocalRandom.current().nextInt(0, 100);
//        System.out.println(k);
//        int l = ThreadLocalRandom.current().nextInt(0, 100);
//        System.out.println(l);
        int m = ThreadLocalRandom.current().nextInt(3);
        System.out.println(m);
        int m1 = ThreadLocalRandom.current().nextInt(3);
        System.out.println(m1);
        int m2 = ThreadLocalRandom.current().nextInt(3);
        System.out.println(m2);
        while(ThreadLocalRandom.current().nextInt(2) != 2) {

        }
    }
}
