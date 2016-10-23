package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 21/10/16.
 */
public class Days15 {
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node tmp = head;
        if (head == null) {
            head = new Node(data);
            return head;
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
        }
        return head;
    }
    private static void display(Node head) {
        Node tmp = head;
        String result = "";
        if (head == null) {
            System.out.println(result);
        } else {
            while(tmp.next != null) {
                if (result.length() == 0) {
                    result = String.valueOf(tmp.data);
                } else {
                    result = result + " " + tmp.data ;
                }
                tmp = tmp.next;
            }
            result = result + " " + tmp.data;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Node head = null;
//        int N = sc.nextInt();
        int N = 4;
        int[] elements = new int[]{2, 3, 4, 1};
        while(N-- > 0) {
           int ele = elements[N];
            head = Days15.insert(head,ele);
        }
        display(head);
    }


}
