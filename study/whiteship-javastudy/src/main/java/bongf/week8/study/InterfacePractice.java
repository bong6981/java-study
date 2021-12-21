package bongf.week8.study;

public class InterfacePractice {
    public static void main(String[] args) {
        Car car = new BungBung();
        BungBung bung = new BungBung();
        bung.greet(car);

        Car car2 = new BangBang();
        car2.refuel();

        Car.introduce();

    }
}
