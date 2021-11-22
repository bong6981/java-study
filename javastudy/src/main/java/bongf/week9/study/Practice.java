package bongf.week9.study;

public class Practice {
    public static void main(String[] args) {
        IllegalStateException ise = new IllegalStateException();
        System.out.println(ise instanceof Exception);
    }

    public int calculate(int n) {

        if (n == 0) {
            throw new IllegalStateException();
        }
        return n * 3;
    }
}
