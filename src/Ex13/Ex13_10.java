package Ex13;

public class Ex13_10 {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(2000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e){}

    }
}

class MyThread implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    MyThread(String name){
        th = new Thread(this, name);
    }

    void start() {
        th.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }
    void resume() {
        suspended = false;
    }
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}