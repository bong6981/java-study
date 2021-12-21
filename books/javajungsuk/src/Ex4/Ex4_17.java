package Ex4;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {

        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("종료");
                break;
            } else if(!(1 <= menu && menu <=3)){
                System.out.println("잘못선택");
                continue;
            }
        }

    }
}
