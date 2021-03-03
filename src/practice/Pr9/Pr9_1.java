package practice.Pr9;

public class Pr9_1 {
    public static void main(String[] args) {
        Sutda c1 = new Sutda(3, true);
        Sutda c2 = new Sutda(3, true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
    }
}

class Sutda {
    int num;
    boolean isKwang;

    Sutda() {
        this(1, true);
    }

    Sutda(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj){
        if(! (obj instanceof Sutda)) return false;
        Sutda x = (Sutda) obj;
        return (this.num == x.num) && (this.isKwang == x.isKwang);
    }

    public String toString(){
        return num + (isKwang ? "K" : "");
    }

}
