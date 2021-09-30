package bongf.week9.study;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            methodA(0);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    static void methodA(int num) throws IOException {
        try {
            if (num == 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            IOException ioException = new IOException();
            ioException.initCause(e);  /// IOException의 예외를 IllegalArgumentException으로 지정/
            throw ioException;
        }
    }
}
