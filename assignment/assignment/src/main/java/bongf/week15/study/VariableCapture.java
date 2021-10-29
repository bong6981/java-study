package bongf.week15.study;

import java.util.Arrays;

public class VariableCapture {
    private static int x = 2;
    private int y = 1;

    public static void main(String[] args) {
        AInterface add = i -> i + x; // static 변수 접근 가능
        AInterface changeStaticVariable = i -> {
            x++;
            return i + x;
        };


        int a = 1;
        for (int i = 0; i < 5; i++) {
            a++;
        }
        int[] test = new int[]{1, 2, 3};
//        Arrays.stream(test).map(x -> x + a).getAsInt(); //에러. final이 아니다.
    }

    public void accessInstanceVariable() {
        AInterface subtract = i -> i - y; // 인스턴스 변수 접근 가능
        AInterface subtract2 = i -> {
            y--;
            return i - y; // 인스턴스 변수 접근 가능
        };
    }

    public static void accessLocalVariable() {
        int z = 1;
        AInterface divde = i -> i / z; // 로컬변수 접근 가능
        AInterface notFianl = (int x) -> {
//            z = z*z; //에러
            return z;
        };
    }
}

@FunctionalInterface
interface AInterface {
    int operate(int x);
}
