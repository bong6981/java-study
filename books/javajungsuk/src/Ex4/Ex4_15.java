package Ex4;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1과 100사이 정수 입력");
            input = sc.nextInt();

            if (input > answer)
                System.out.println("더 적은 수로 시도");
            else if (input < answer)
                System.out.println("더 큰 수로 시도");
        } while (input != answer);

        System.out.println("정답");

    }
}

