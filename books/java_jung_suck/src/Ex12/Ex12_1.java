package Ex12;

import java.util.*;

class Product {}
class Tv extends Product{}
class Audio extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
//        ArrayList<Product> tvList2 = new ArrayList<Tv>();
        List<Tv> tvList1 = new ArrayList<Tv>();

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);
//        printAll(tvList);
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}

