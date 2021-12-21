package bongf.week9.study;

public class WithoutThrows {
    public static void main(String[] args) {
        System.out.println("main");
        try {
            two();
        } catch (ArithmeticException e) {
            System.out.println("handle");
        }
    }

    public static void two() {
        System.out.println("two");
        three(0);
    }

    public static void three(int n) {
        System.out.println("three" + "," + n);
        int x = 6 / n;
    }
}
