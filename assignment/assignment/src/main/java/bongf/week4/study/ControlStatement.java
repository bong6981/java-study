package bongf.week4.study;

public class ControlStatement {
    public static void main(String[] args) {
        labeledForStatement();
//        breakFor();
//        breakFor2();
//        breakWhile();
//        breakWhile2();
//          doWhile();
//        continueCheck();
    }

    public static void switchStatement( ) {
        String month =  "march";
        int monthNumber = 0;

        switch (month) {
            case "january" :
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
        }
        System.out.println(monthNumber);
    }

    public static void labeledForStatement() {
        int x = 0;
        int y = 0;
        loop1: for (int outLoop=0; outLoop<=10; outLoop++){
            x = outLoop;
            for (int inLoop=0; inLoop<=5; inLoop++){
                y = inLoop;
                if(inLoop==3) {
                    break loop1;
                }
            }
        }
        System.out.println(x+","+y);
    }

    public static void breakFor() {
        for (int i = 0; i <= 2; i++) {
            i += 3;
            System.out.println(i);
        }
    }

    public static void breakFor2() {
        for (int i = 0; i <= 2; i++) {
            i += 3;
            i -= 3;
            System.out.println(i);
        }
    }

    public static void breakWhile() {
        int a = 0;
        while( a <= 3) {
            a += 4;
            System.out.println(a);
        }
    }

    public static void breakWhile2() {
        int a = 0;
        while( a <= 3) {
            a += 4;
            a -= 1;
            System.out.println(a);
        }
    }

    public static void doWhile(){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 1);
    }

    public static void continueCheck() {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}

