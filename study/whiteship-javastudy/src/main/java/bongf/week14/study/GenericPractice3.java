package bongf.week14.study;

import java.util.Stack;

public class GenericPractice3 {
    public static void main(String[] args) {
        MyNode2 mn = new MyNode2(5);
        mn.setData("Bye");
        Node2 n = mn;
        n.setData("Hello");
//        Integer x = mn.data;

    }
}

class Node2 {

    public Object data;

    public Node2(Object data) { this.data = data; }

    public void setData(Object data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode2 extends Node2 {

    public MyNode2(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
