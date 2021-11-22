package bongf.week14.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericPractice2 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        Integer x = 1;
        box.set(x);
        Integer integer = box.get();
        System.out.println(integer);

        Box<Integer> integerBox = new Box<>();
        integerBox.set(1);
        Pair<String, Box<Integer>> pair = new Pair<>("Hello", integerBox);
        String key = pair.getKey();
        Box<Integer> value = pair.getValue();

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
//        boolean same = Util.<Integer, String>compare(p1, p2);
        boolean same = Util.compare(p1, p2);

//        Pair<Integer, Integer> p1 = new Pair<>(1, 1);
//        Pair<Integer, String> p2 = new Pair<>(2, "pear");
//        boolean same = Util.compare(p1, p2);

        Box<Integer> integerBox2 = new Box<>();
        integerBox2.set(1);
        integerBox2.inspect(1);
//        integerBox2.inspect("hello"); //컴파일 에러. 스트링이기 때문에

        Box<Number> integerBox3 = new Box<>();
        integerBox3.add(new Integer(10));
        integerBox3.add(new Double(10.1));

        Box box100 = new Box();
    }
}

//class Box {
//    private Object object;
//
//    public void set(Object object) { this.object = object; }
//    public Object get() { return object; }
//}

class Box<T> {
    private T t;
    private List<T> list = new ArrayList<>();

    public <U extends Number> void inspect(U u) {
        System.out.println("t.getClass().getName() = " + t.getClass().getName());
        System.out.println("u.getClass().getName() = " + u.getClass().getName());
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void add(T t) {
        list.add(t);
    }
}

//class Box<Type> {
//    private Type t;
//
//    public void set(Type t) { this.t = t; }
//    public Type get() { return t; }
//}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

class NotGeneric {
    public static <T> void anything(T anything) {
        //
    }
}
