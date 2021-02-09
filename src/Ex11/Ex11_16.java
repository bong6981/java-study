package Ex11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("id와 password 입력");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("아이디없음");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비번 불일치");
            } else {
                System.out.println("로그인");
                break;
            }

        }
    }

}
