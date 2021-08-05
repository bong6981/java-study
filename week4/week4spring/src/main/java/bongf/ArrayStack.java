package bongf;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private int[] stackArray;
    private int size;

    public ArrayStack() {
    }

    public void push(int data) {
        if (size == 0) {
            stackArray = new int[]{data};
        } else {
            stackArray = Arrays.copyOf(stackArray, size + 1);
            stackArray[size] = data;
        }
        size++;
    }

    public void pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        stackArray = Arrays.copyOfRange(stackArray, 0, size - 1);
        size--;
    }

    public int[] getStackArray() {
        return stackArray;
    }
}
