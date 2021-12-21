package Ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_2 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
        Consumer<Integer> c = i -> System.out.println(i+",");
        Predicate<Integer> p = i -> i%2==0;
        Function<Integer, Integer> f= i -> i/10*10; // 일의자리 없애기

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = dosomething(f, list);
        System.out.println(newList);
    }

    private static List<Integer> dosomething(Function<Integer, Integer> f, List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list.size());
        for(Integer i : list){
            newList.add(f.apply(i));
        }
        return newList;
    }

    private static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c, List<Integer> list) {
        System.out.println("[");
        for(Integer i : list) {
            if(p.test(i)){
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for(int i=0; i<10; i++){
            list.add(s.get());
        }
    }
}
