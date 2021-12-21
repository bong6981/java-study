package bongf.week6.study;

public class GetSuperClassPrivateMember {
    public static void main(String[] args) {
        Car c = new Car();
        c.printPrivateN();
    }
}

class Vehicle {
    private int n = 1;

    public int getPrivateN() {
        return this.n;
    }
}

class Car extends Vehicle {
    public void printPrivateN() {
        int n = super.getPrivateN();
        System.out.println(n); // 1출력
    }
}
