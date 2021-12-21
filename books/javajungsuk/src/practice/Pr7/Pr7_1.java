package practice.Pr7;

import java.util.Arrays;

public class Pr7_1 {
    public static void main(String[] args) {
        SutaDeck deck = new SutaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");

        }
    }
}

class SutaDeck {
    final int CARD_NUM = 20;
    SutaCard[] cards = new SutaCard[CARD_NUM];

    SutaDeck() {

        int[] select1 = { 0, 10 };
        int[] select2 = { 2, 12 };
        int[] select3 = { 7, 17 };
        int[] selected = new int[3];

        selected[0] = select1[(int)(Math.random()*2)];
        selected[1] = select2[(int)(Math.random()*2)];
        selected[2] = select3[(int)(Math.random()*2)];

        System.out.println(Arrays.toString(selected));

        for(int i=0; i<cards.length; i++){
//           int num = i+1;
//           if(i>=10){ num -= 10; }
            int num = i%10+1;
           cards[i] = new SutaCard(num, false);
            for (int j = 0; j < selected.length; j++) {
                if(i==selected[j]){
                    cards[i] = new SutaCard(num, true);
                }

            }
       }



    }
}

class SutaCard {
    int num;
    boolean isKwang;

    SutaCard(){
        this(1, true);
    }

    SutaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}
