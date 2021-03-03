package Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();
                
                if("".equals(input)) continue;
                
                if(input.equalsIgnoreCase("q")){
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    int i = 0;
                    save(input);
                }
            } catch(Exception e){
                System.out.println("입력오류");
            }
        }
    }

    private static void save(String input) {
    }
}
