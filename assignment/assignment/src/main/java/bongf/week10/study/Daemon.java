package bongf.week10.study;

public class Daemon extends Thread{
    @Override
    public void run() {

       this.setName("Daemon");
       System.out.printf("%s starts%n", this.getName());

       Thread childDaemon = new Daemon();
       childDaemon.setName("childDaemon");
       System.out.printf("제 이름은 %s 입니다 . 제가 데몬일까요? %s %n", childDaemon.getName(), childDaemon.isDaemon());

//       if(this.isDaemon()) {
//           System.out.printf("%s : 저는 데몬입니다%n", this.getName());
//       }

       int count = 0;
       while(true) {
           try {
               Thread.sleep(1000);
               count++;
               System.out.printf("%s %d초 진행 중%n", this.getName(), count);
           } catch (InterruptedException e) {}
       }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.printf("%s starts%n", t.getName());
        Thread d = new Daemon();
        d.setDaemon(true);
        d.start();
        Thread.sleep(2000);
        System.out.printf("%s ends%n", t.getName());
    }
}
