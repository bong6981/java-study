package bongf.week10.study;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
        String[] importantInfo = {
                "hi",
                "bye",
                "hoi",
                "dui"
        };

        for (String s : importantInfo) {
            // 4초 일시 중지
            Thread.sleep(4000);
            System.out.println(s);
        }
    }
}
