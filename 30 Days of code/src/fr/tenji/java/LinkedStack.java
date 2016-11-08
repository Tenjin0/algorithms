package fr.tenji.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by nekran on 07/11/16.
 */
public class LinkedStack<Item> implements Iterable<Item> {

    private int size;
    private Node<Item> first;

    public LinkedStack() {
        this.size = 0;
        this.first = null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public int Size() {
        return this.size;
    }

    public void push(Item item) {
        Node<Item> newNode = new Node<Item>(item);
        Node<Item> oldFirst = this.first;
        this.first = newNode;
        newNode.next = oldFirst;
        this.size++;
    }

    public Item peek() {
        return first.data;
    }

    public Item pop() {
        Node<Item> oldFirst = this.first;
        this.first = this.first.next;
        this.size--;
        return this.first.data;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Iterator<Item> i = this.iterator(); i.hasNext(); ) {
            s.append(i.next());
            s.append(' ');
        }
//
        return s.toString();
    }
    @Override
    public Iterator<Item> iterator() {
        return new LinkedStack.LinkedStackIterator();    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    private class LinkedStackIterator implements Iterator<Item> {
        private Node<Item> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.data;
            current = current.next;
            return item;
        }

        @Override
        public void remove() { throw new UnsupportedOperationException();

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }
    public static void main(String[] args) {
        LinkedStack<Integer> stackInt = new LinkedStack<>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        System.out.println(stackInt.toString());
    }
}
