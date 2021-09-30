package bongf.week6.study;

public class OverridingPriority {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());


        MyClass1 myClass1 = new MyClass1();
        myClass1.print();
        MyClass2 myClass2 = new MyClass2();
        myClass2.print();
    }
}

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}

interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}

class Pegasus extends Horse implements Flyer, Mythical {

}

interface MyInterfaceA {
    default void print() {
        System.out.println("Print in MyInterfaceA");
    }
}

//abstract class MyClass1 {
//    public abstract void print();
//}

interface MyInterfaceB extends MyInterfaceA {
    default void print() {
        System.out.println("Print in MyInterfaceB");
    }
}
class MyClass1 implements MyInterfaceA {
}
class MyClass2 extends MyClass1 implements MyInterfaceA, MyInterfaceB {
}
