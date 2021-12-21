package bongf.week10.study;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Thread3 t3 = new Thread3();
        t3.start();
        Thread.sleep(1000);
        System.out.println(t3.getState());
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("t3 start");
        Thread4 t4 = new Thread4();
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread3 ends");
    }
}

class Thread4 extends Thread {
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread4 ends");
    }
}
