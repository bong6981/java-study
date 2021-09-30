package bongf.week10.study;

public class WhichSleep {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        try {
            t1.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("Main종료");
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("-");
        }
        System.out.println("th1종료");
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("|");
        }
        System.out.println("th2종료");
    }
}
