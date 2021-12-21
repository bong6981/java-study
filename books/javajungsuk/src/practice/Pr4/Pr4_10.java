package practice.Pr4;

import java.util.Scanner;

public class Pr4_10 {
    public static void main(String[] args) {
        int answer = (int) (Math.random()*100)+1;
        int input =0, count =0;

        Scanner s = new Scanner(System.in);

        do{
            count++;
            System.out.println("1.100");
            input = s.nextInt();

            if(input==answer){
                System.out.println("정답");
                break;
            } else if(input > answer){
                System.out.println("너무커요");
            } else {
                System.out.println("너무작아요");

            }
        } while (true);
        System.out.println(count + "만에 맞힘");
    }
}
