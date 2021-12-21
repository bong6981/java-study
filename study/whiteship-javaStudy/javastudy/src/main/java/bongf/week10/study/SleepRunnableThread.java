package bongf.week10.study;

public class SleepRunnableThread extends Thread{
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println("왜깨우시죠");
        }
        System.out.println("Thread wake");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Thread t = new Thread(new SleepRunnableThread());
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        System.out.println("Main end");
    }
}

