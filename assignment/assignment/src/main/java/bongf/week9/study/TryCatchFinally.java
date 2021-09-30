package bongf.week9.study;

import java.util.Arrays;

public class TryCatchFinally {
    public static void main(String[] args) {
       TryCatchFinally tc = new TryCatchFinally();
//       tc.tryCatch();
//        System.out.println(tc.notCatch());
//        System.out.println(tc.tryReturn());
//        System.out.println(tc.tryFinallyReturn());
//        System.out.println(tc.tryFinallyReturnVariable());
//        System.out.println(Arrays.toString(tc.tryFinallyReturnReference()));
        System.out.println(Arrays.toString(tc.tryFinallyReturnReference2()));
//        System.out.println(tc.catchFinallyReturn());
//        System.out.println(tc.onlyTryReturn());
    }



    public void tryCatch() {
        System.out.println(1);
        try {
            System.out.println(0/0);
            System.out.println(2);
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
    }

    public void catchBlock() {
        try {
            System.out.println(0 / 0);
            System.out.println(2);

        } catch (Exception e) {
            System.out.println(3);
//        } catch (ArithmeticException ae) {
//            System.out.println(4);
        } finally {
            System.out.println(5);
        }
    }

    public void multiCatchBlack() {
        try {
            System.out.println(0 / 0);
            System.out.println(2);

//        } catch (Exception | ArithmeticException e) {

        } catch (Exception e) {

        }
    }

    public int tryReturn() {
        try {
            System.out.println("in try");
            int x = 10/0;
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
        }
        return 2;
    }

    public int tryFinallyReturn() {
        try {
            System.out.println("in try");
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
            return 2;
        } finally {
            System.out.println("in finally");
            return 3;
        }
    }

    public int tryFinallyReturnVariable() {
        int n = 0;
        try {
            System.out.println("in try");
            n = 1;
            return n;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
            n = 2;
            return n;
        } finally {
            System.out.println("in finally");
            n = 3;
        }
    }

    public int[] tryFinallyReturnReference() {
        int[] arr = {0,0,0};
        try {
            System.out.println("in try");
            arr[0] = 1;
            return arr;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
            arr[1] = 2;
            return arr;
        } finally {
            System.out.println("in finally");
            arr[2] = 3;
        }
    }

    public int[] tryFinallyReturnReference2() {
        int[] arr = {0,0,0};
        try {
            System.out.println("in try");
            arr = new int[]{1, 1, 1};
            return arr;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
            arr[1] = 2;
            return arr;
        } finally {
            System.out.println("in finally");
            arr[2] = 3;
            arr = new int[]{3, 3, 3};
        }
    }

    public int catchFinallyReturn() {
        try {
            System.out.println("in try");
            int x = 10/0;
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
            return 2;
        } finally {
            System.out.println("in finally");
            return 3;
        }
    }

    public int onlyTryReturn() {
        try {
            System.out.println("in try");
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("in catch");
        } finally {
            System.out.println("in finally");
        }
        return 2;
    }

    /*
    public int notCatch() {
        int x = 10 / 0;
        return 1;
    }
    원래 이것을 실행하면 ArithmeticException 발생
     */
    public int notCatch() {
        try {
            int x = 10 / 0;
            return 1;
        }
        finally {
            return 42;
        }
    }
}
