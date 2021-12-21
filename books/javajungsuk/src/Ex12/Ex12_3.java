package Ex12;

import javax.swing.*;
import java.sql.Struct;
import java.util.ArrayList;

interface Eatable {}
class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) {return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//        FruitBox<Toy> toyBox = new FruitBox<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Fruit());
//        appleBox.add((Apple) ( new Fruit()));
//        appleBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println("fruitBox : " + fruitBox);
        System.out.println("appleBox : " + appleBox);
        System.out.println("grapeBox : " + grapeBox);

    }
}
