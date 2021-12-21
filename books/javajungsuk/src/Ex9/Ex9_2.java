package Ex9;

import java.util.Objects;

class Person {
    long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        return id == ((Person)o).id;
    }
    // hashCode도 오버라이딩 해주세요
    Person(long id) {
        this.id = id;
    }

  
}

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);
        
        if(p1.equals(p2))
            System.out.println("같은사람");
        else
            System.out.println("다른사람");
    }
}
