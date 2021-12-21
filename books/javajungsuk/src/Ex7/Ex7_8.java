package Ex7;

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class TV extends Product{
    TV(){
        super(100);
    }

    public String toString() { return "Tv"; }
}

class Computer extends Product{
    Computer() {
        super(200);
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구입 ");
    }
}
public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new TV());
        b.buy(new Computer());
        System.out.println(b.money + "원 남음");
        System.out.println(b.bonusPoint + "점 누적");
    }

}
