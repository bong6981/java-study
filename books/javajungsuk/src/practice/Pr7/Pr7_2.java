package practice.Pr7;

import java.util.Arrays;

public class Pr7_2 {
    public static void main(String[] args) {
        SutaDeck2 deck = new SutaDeck2();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutaDeck2 {
    final int CARD_NUM = 20;
    SutaCard2[] cards = new SutaCard2[CARD_NUM];

    SutaDeck2() {

        int[] select1 = {0, 10};
        int[] select2 = {2, 12};
        int[] select3 = {7, 17};
        int[] selected = new int[3];

        selected[0] = select1[(int) (Math.random() * 2)];
        selected[1] = select2[(int) (Math.random() * 2)];
        selected[2] = select3[(int) (Math.random() * 2)];

        System.out.println(Arrays.toString(selected));

        for (int i = 0; i < cards.length; i++) {
//           int num = i+1;
//           if(i>=10){ num -= 10; }
            int num = i % 10 + 1;
            cards[i] = new SutaCard2(num, false);
            for (int j = 0; j < selected.length; j++) {
                if (i == selected[j]) {
                    cards[i] = new SutaCard2(num, true);
                }
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * cards.length);
            SutaCard2 tempCard = cards[0];
            cards[0] = cards[random];
            cards[random] = tempCard;
        }
    }

    SutaCard2 pick(int index) {
        return cards[index];
    }

    SutaCard2 pick(){
        int random = (int) (Math.random()*cards.length);
        return cards[random];
    }

}

class SutaCard2 {
    int num;
    boolean isKwang;

    SutaCard2() {
        this(1, true);
    }

    SutaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
