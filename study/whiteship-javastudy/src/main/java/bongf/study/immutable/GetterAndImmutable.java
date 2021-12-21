package bongf.study.immutable;

import java.util.HashMap;
import java.util.Map;

public class GetterAndImmutable {
    public static void main(String[] args) {
        Map<String, String> address = new HashMap<>();
        address.put("city", "Seoul");
        Person person = new Person("Hong", address);
        Map<String, String> takenAddress = person.getAddress();
        takenAddress.put("city", "London"); // Person{name='Hong', address={city=London}}
        System.out.println(person);
    }

    static class Person {
        String name;
        Map<String, String> address;

        public Person(String name, Map<String, String> address) {
            this.name = name;
            this.address = address;
        }

        public Map<String, String> getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }
    }
}
