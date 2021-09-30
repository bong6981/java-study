package bongf.week9.study;

public class ReThrowing {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            // 해당 예외 처리 2
        }
    }

    public static void method() throws Exception  {
        try {
            throw new Exception();
        } catch (Exception e) {
            // 해당 예외 처리 1
            throw e;
        }
    }
}
