package bongf.study.deepcopy;

public class CloneablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B("hong");
        B copiedB = (B) b.clone();
        b.bName = "NewHong";
        System.out.println(b); //B{bName='NewHong'}
        System.out.println(copiedB); //B{bName='hong'}

        A a = new A("HONG", b);
        A newA = (A) a.clone();

        a.b.bName = "NewNewHong";
        System.out.println(a); //A{name='HONG', b=B{bName='NewNewHong'}}
        System.out.println(newA); //A{name='HONG', b=B{bName='NewHong'}}
    }
}

class A implements Cloneable{
    public String name;
    public B b;

    public A(String name, B b) {
        this.name = name;
        this.b = b;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        A a = (A) super.clone();
//        a.b = (B) a.b.clone();
//        return a;
//    }

    @Override
    public Object clone() {
        A a = null;
        try {
            a = (A) super.clone();
        } catch (CloneNotSupportedException e) {
            a = new A(this.name, this.b);
        }
        a.b = (B) this.b.clone();
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}

class B implements Cloneable{
    public String bName;

    public B(String bName) {
        this.bName = bName;
    }

    @Override
    public Object clone() {
        try {
           return  (B) super.clone();
        } catch (CloneNotSupportedException e) {
            return new B(this.bName);
        }
    }

    @Override
    public String toString() {
        return "B{" +
                "bName='" + bName + '\'' +
                '}';
    }
}
