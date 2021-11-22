package bongf.study.deepcopy;

public class ShallowCopyDeepCopy2 {
    public static void main(String[] args) {
        Address address = new Address("bbaebbaero", "seoul", "Korea");
        User user = new User("Hong", "Gildong", address);
        User copied = new User(user.firstName, user.lastName, user.address);

        System.out.println(user==copied); // false
        user.address.city = "newCity";
        System.out.println(copied.address); // Address{street='bbaebbaero', city='newCity', country='Korea'}
        System.out.println(user.address.equals(copied.address)); //true

        User deepCopied = new User(user);
        System.out.println(deepCopied.address== user.address); //false

    }
}

class Address {
    String street;
    String city;
    String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Address(Address that) {
        this(that.street, that.city, that.country);
    }

    @Override
    public Object clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address(this.street, this.city, this.country);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class User {
   String firstName;
   String lastName;
   Address address;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public User(User that) {
        this(that.firstName, that.lastName, new Address(that.address));
    }

//    @Override
//    public Object clone() {
//        User user = null;
//        try {
//                user = (User)
//        }
//    }
}
