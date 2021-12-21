package bongf.week15.study;

public class LambdaPractice2 {
    public static void main(String[] args) {
        MyFunction f = (int a, int b) -> Math.max(a, b);
        System.out.println(f.max(3, 4)); //4
    }
}

interface MyFunction {
    public abstract int max(int a, int b);
}
