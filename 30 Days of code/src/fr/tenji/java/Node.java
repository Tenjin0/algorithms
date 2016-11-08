package fr.tenji.java;

/**
 * Created by nekran on 21/10/16.
 */
public class Node<E> {
    E data;
    Node next;

    public Node(E data) {
        this.data = data;
        next = null;
    }
}

