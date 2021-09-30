package bongf.week6.study;

public class SuperClassConstructorError {
}

class Vehicle2 {
    int num = 1;

    Vehicle2(int num) {
        this.num = num;
    }
}

class Car2 extends Vehicle2 {
    int num;
    String name;

    Car2(int num, String name) {
        super(num);
        this.name = name;
    }
}
