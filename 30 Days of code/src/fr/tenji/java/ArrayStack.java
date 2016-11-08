package fr.tenji.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by nekran on 31/10/16.
 */
public class ArrayStack<Item> implements Iterable<Item> {
        private Item[] items;
        private int size;

    public ArrayStack() {
        this.items = (Item[]) new Object[2];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void resize(int n) {
        Item[] newItems = (Item[]) new Object[n];
        System.out.println(n + ", " + Arrays.toString(items));
        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }
        this.items = newItems;
    }

    public void push(Item item) {
        if (this.size >= this.items.length) {
            resize(this.size * 2);
        }
        this.items[this.size++] = item;
    }

    public Item pop() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException("stack underflow");
        }
        if (size <= this.items.length / 4) {
            System.out.println(size);
            resize(this.items.length /2);
        }
        Item tmp = this.items[--size];
        this.items[size] = null;
        return tmp;
    }

    public Item peek() throws  NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return items[size - 1];
    }

    public void display() {
        System.out.println(Arrays.toString(this.items));
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    private class ArrayStackIterator implements Iterator<Item> {
        private int i;

        public ArrayStackIterator() {
            this.i = size - 1;
        }

        @Override
        public boolean hasNext() {
            return this.i >= 0;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return items[i--];
        }

        @Override
        public void remove() {
            throw new NoSuchElementException();
        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
//        try {
//            arrayStack.pop();
//            arrayStack.pop();
//            arrayStack.pop();
//            arrayStack.pop();
//        } catch(NoSuchElementException e) {
//            e.getStackTrace();
//        }
        Iterator<Integer> it = arrayStack.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.print(element + " ");
        }
    }
}
