package bongf;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueue {
    private int[] queueArray;
    private int size;

    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer(1);
        q.offer(2);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
        q.poll();
        q.poll();
    }

    public ArrayQueue() {
    }

    public int offer(int data) {
        if (size == 0) {
            queueArray = new int[]{data};
        } else {
            queueArray = Arrays.copyOf(queueArray, size + 1);
            queueArray[size] = data;
        }
        size++;
        return data;
    }

    public Integer poll() {
        if(size == 0) {
            return null;
        }
        Integer num = queueArray[0];
        queueArray = Arrays.copyOfRange(queueArray, 1, size);
        size--;
        return num;
    }

    public int[] getQueueArray() {
        return queueArray;
    }
}
