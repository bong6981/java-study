package Ex4;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요.>");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재는 봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
