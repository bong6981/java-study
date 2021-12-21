package practice.Pr6;

public class Pr6_21 {
    private static int abs(int value){
        if(value<0){
            return -value;
        }
        return value;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));
        value = 10;
        System.out.println(abs(value));
    }
}
