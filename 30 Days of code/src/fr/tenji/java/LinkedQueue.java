package fr.tenji.java;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by nekran on 31/10/16.
 */
public class LinkedQueue<Item> implements Iterable<Item> {

    private int size;
    private Node<Item> first;
    private Node<Item> last;

    public LinkedQueue() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }



    public int Size() {
        return this.size;
    }

    public void enQueue(Item item) {
        Node<Item> newNode = new Node<>(item);
        Node<Item> oldLast = this.last;
        this.last = newNode;
        if (isEmpty()) {
            this.first = this.last;
        } else {
            oldLast.next = newNode;
        }
        this.size++;
    }
    public Item deQueue() {
        if(isEmpty()) throw new NoSuchElementException("Queue underflow");
        Node<Item> oldFirst = this.first;
        this.first = this.first.next;
        if (this.first == null)
            this.last = null;
        this.size--;
        return oldFirst.data;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }


    public static void main(String[] args) {
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        lq.enQueue(1);
        lq.enQueue(2);
        lq.enQueue(3);
        lq.deQueue();
        lq.deQueue();
        lq.deQueue();
        try{

        } catch(NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lq.toString());
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedQueueIterator();
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    private class LinkedQueueIterator implements  Iterator<Item> {

        private Node<Item> current = first;

        public LinkedQueueIterator() {
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = current.data;
            current  = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }
}

