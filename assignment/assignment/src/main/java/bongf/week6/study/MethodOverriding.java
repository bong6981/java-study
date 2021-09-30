package bongf.week6.study;

import java.io.IOException;

public class MethodOverriding {
    public static void main(String[] args) {

    }
}

class A {

}

class B extends A {

}

class C {

}

class Vehicle3 {
    int oil = 100;

    public void run() throws IndexOutOfBoundsException{
        oil--;
    }

    public A getObject() {
        return new A();
    }
}

class Car3 extends Vehicle3 {
    public void run() throws IndexOutOfBoundsException {
        oil -= 2;
    }

    public B getObject() {
        return new B();
    }

//    public C getObject() { //컴파일 에러
//        return new C();
//    }
}

