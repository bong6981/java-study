package bongf.week6.study;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit peach = new Peach();

        fruit.eat();
        peach.eat();
    }
}

class Fruit {
    public void eat() {
        System.out.println("과일은 맛있어");
    }
}

class Peach extends Fruit {
    @Override
    public void eat() {
        System.out.println("복숭아는 맛있어");
    }
}
