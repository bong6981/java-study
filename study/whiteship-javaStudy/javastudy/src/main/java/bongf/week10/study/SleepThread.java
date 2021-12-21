package bongf.week10.study;

public class SleepThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Thread t = new SleepThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
        System.out.println("end");
    }

    public void run() {
        long count = 0;
        while(!isInterrupted()) {
            count++;
        }
        System.out.println("Thread wake : " + count);
    }
}
