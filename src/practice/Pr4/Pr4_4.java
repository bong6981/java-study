package practice.Pr4;

public class Pr4_4 {
    public static void main(String[] args) {
        int last = calculate();
        System.out.println(last);

    }

    private static int calculate() {
        int sum = 0;
        int s = 1;
        int last =0;

        for (int i = 1; sum < 100; i++) {
            last = s * i;
            sum += last;
            s = -s;
        }
        return last;
    }
}
