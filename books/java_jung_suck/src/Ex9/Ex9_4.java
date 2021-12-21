package Ex9;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Card)) return false;
//        Card card = (Card) o;
//        return number == card.number && Objects.equals(kind, card.kind);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(kind, number);
//    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Card)) return false;
        Card c = (Card)obj;
        return c.number==this.number && Objects.equals(this.kind, c.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public String toString(){
        return "kind : "+kind+ ", number:"+number;
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("HEART", 1);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }

}
