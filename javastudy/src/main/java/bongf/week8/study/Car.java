package bongf.week8.study;

public interface Car {
    void run();
    void stop();
    default void refuel() {
        System.out.println("yummy");
    }
    static void introduce() {
        System.out.println("Car");
    }
}
