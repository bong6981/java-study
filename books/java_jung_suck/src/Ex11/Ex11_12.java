package Ex11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");  setA.add("2");  setA.add("3");
        setA.add("4");  setA.add("5");
        System.out.println("A="+setA);

        setB.add("4");  setB.add("5");  setB.add("6");
        setB.add("7");  setB.add("8");
        System.out.println("B="+setB);

//        setA.retainAll(setB);
//        System.out.println(setA);
//
//        setA.addAll(setB);
//        System.out.println(setA);

        setA.removeAll(setB);
        System.out.println(setA);

//        Iterator it = setB.iterator();
//        while (it.hasNext()){
//            Object tmp = it.next();
//            if (setA.contains(tmp))
//                setKyo.add(tmp);
//        }
//
//        it = setA.iterator();
//        while (it.hasNext()) {
//            Object tmp = it.next();
//            if(!setB.contains(tmp))
//                setCha.add(tmp);
//        }
//
//        it = setA.iterator();
//        while(it.hasNext())
//            setHab.add(it.next());
//
//        it = setB.iterator();
//        while(it.hasNext())
//            setHab.add(it.next());

        System.out.println(" a 교집합 b " + setKyo);
        System.out.println(" a 차집합 b " + setCha);
        System.out.println(" a 합집합 b " + setHab);







    }
}
