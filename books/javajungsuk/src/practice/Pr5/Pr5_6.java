package practice.Pr5;

import java.util.Scanner;

public class Pr5_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int x = (int)(Math.random()*question.length);
                char temp = question[0];
                question[0] = question[x];
                question[x] = temp;

            }


        }
    }
}
