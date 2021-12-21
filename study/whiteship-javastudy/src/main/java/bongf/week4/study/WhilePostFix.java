package bongf.week4.study;

public class WhilePostFix {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (++i < 10) { System.out.println("i = " + i); }
        System.out.println(i);
        while (j++ < 10) { System.out.println("j = " + j); } //후위형, 비교후 값 증가 시킴
        System.out.println(j);
    }
}
