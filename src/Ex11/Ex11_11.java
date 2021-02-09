package Ex11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return this.age == p.age && this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}