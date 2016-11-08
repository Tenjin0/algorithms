package fr.tenji.java;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nekran on 24/10/16.
 */
public class Stack<E> {
    private int top;
    E[] arr;

    public Stack(int size) {
        this.arr = (E[]) new Object[size];
        this.top = 0;
    }

    public boolean empty() {
        return top == 0;
    }

    public void push(E str) throws StackOverflowError {
        if (top < arr.length) {
            arr[top++]  = str;
        } else {
            throw new StackOverflowError();
        }
    }

    public E pop() {
        if (!this.empty()) {
            E tmp = arr[--top];
            arr[top] = null;
            return tmp;
        } else {
            return null;
        }
    }

    public E peek() {
        if (!this.empty()) {
            return arr[top - 1];
        } else {
            return null;
        }
    }

    public void display() {
        System.out.println(Arrays.toString(this.arr));
    }
}
