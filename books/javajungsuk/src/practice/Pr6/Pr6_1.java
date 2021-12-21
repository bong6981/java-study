package practice.Pr6;

public class Pr6_1 {
    public static void main(String[] args) {
        Student a = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = a.info();
        System.out.println(str);

        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());

    }

}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    double average;

    Student() {
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.average =  Math.round(total/3f*10)/10.0;
    }

    public String info() {
        String info;
        info = this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + this.total + "," + this.average;
        return info;
    }

    public int getTotal() {
        int result = this.kor + this.eng + this.math;
        this.total = result;
        return result;
    }

    public double getAverage() {
        double result =  Math.round(this.total/3f*10)/10.0;
        return result;
    }
}
