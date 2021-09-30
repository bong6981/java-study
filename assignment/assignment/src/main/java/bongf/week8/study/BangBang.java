package bongf.week8.study;

public class BangBang implements NewCar{
    @Override
    public void run() {
        System.out.println("brrrrr");
    }

    @Override
    public void stop() {
        System.out.println("Kkik!");
    }

    @Override
    public void refuel() {
        System.out.println("delicious!!!");
    }
}
