package bongf;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private int[] stackArray;
    private int size;

    public ArrayStack() {
    }

    public int push(int data) {
        if (size == 0) {
            stackArray = new int[]{data};
        } else {
            stackArray = Arrays.copyOf(stackArray, size + 1);
            stackArray[size] = data;
        }
        size++;
        return data;
    }

    public int pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        int num = stackArray[size-1];
        stackArray = Arrays.copyOfRange(stackArray, 0, size - 1);
        size--;
        return num;
    }

    public int[] getStackArray() {
        return stackArray;
    }
}
