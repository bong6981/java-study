package practice.Pr6;

public class Pr6_18 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isNumber(str));

        str = "1234o";
        System.out.println(isNumber(str));

    }

    private static boolean isNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!( '0' <= str.charAt(i) && str.charAt(i) <= '9')){
                return false;
            }

        }
        return true;
    }
}
