package fr.tenji.java;

/**
 * Created by nekran on 21/10/16.
 */
public class Days15v2 {
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node tmp = head;
        if (head == null) {
            head = new Node(data);
            return head;
        } else if (head.next == null) {
            head.next = new Node(data);
        } else {
           insert(head.next, data);
        }
        return head;
    }
    private static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
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
            head = Days15v2.insert(head,ele);
        }
        display(head);
    }


}
