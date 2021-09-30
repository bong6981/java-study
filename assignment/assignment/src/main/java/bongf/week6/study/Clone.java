package bongf.week6.study;

public class Clone {
    public static void main(String[] args) {
        Student s = new Student("Chars");
        Student m = s;
        m.changeName("Kim");
        System.out.println(s.name); // Kim



        Student student = new Student("Cheol");
        student.toString(); // 가능, 접근제어자 public
        try {
            student.clone() ; // 불가능, 접근제어자 clone
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Cloneable {
    String name;
    Student(String name) {
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
