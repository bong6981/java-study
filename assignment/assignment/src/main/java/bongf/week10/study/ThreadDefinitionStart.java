package bongf.week10.study;

public class ThreadDefinitionStart {
    public static void main(String[] args) throws InterruptedException {
        getSleptThreadState();
//        getThreadState();
    }


    public static void getSleptThreadState() throws InterruptedException{
        Runnable r = new HelloRunnable();
        Thread t = new Thread(r);
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }

    public static void getThreadState() {
        Runnable r = new HelloRunnable();
        Thread t = new Thread(r);
        t.start();
        System.out.println(t.getState());

        Thread t1 = new HelloThread();
        t1.start();
        System.out.println(t.getState());
        t.stop(); //deprecate되었지만 test를 위해 사용
        System.out.println(t.getState());
        t.start();
    }

}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Runnable from a thread!");
    }
}

class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello Thread from a thread!");
    }
}
