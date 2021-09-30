package bongf.week8.study;

public class BungBung implements Car{

    @Override
    public void run() {
        System.out.println("brrrrr");
    }

    @Override
    public void stop() {
        System.out.println("Kkik!");
    }

    public void greet(Car car) {
        System.out.println("hello");
    }

    public Car copy() {
        return new BungBung();
    }

    @Override
    public void refuel() {
        System.out.println("yummy yummy!");
    }
}
