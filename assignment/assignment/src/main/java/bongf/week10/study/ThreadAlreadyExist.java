package bongf.week10.study;

public class ThreadAlreadyExist extends Thread {

    @Override
    public void run() {
        this.setName("newThread");
        System.out.printf("%s %d start%n", this.getName(), this.getId());
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.printf("Main Thread : %s %d start%n", t.getName(), t.getId());
        Thread newThread = new ThreadAlreadyExist();
        newThread.start();
        System.out.println("Main Thread end");
    }
}
