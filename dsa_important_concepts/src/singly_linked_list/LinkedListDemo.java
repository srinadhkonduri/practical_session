package singly_linked_list;

public class LinkedListDemo {

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);  // fixed: should call itself
        System.out.print(head.data + " "); // use print, not println
    }

    public static void displayR(Node head) {
        if (head == null) return;
        System.out.print(head.data + " "); // use print
        displayR(head.next);  // fixed: should call itself
    }

    // Iterative display
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // use print
            head = head.next;
        }
    }

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(34);
        Node e = new Node(45);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Display in reverse: ");
        displayReverse(a);
        System.out.println();

        System.out.print("Display recursively: ");
        displayR(a);
        System.out.println();

        System.out.print("Display iteratively: ");
        display(a);
        System.out.println();

        int res = length(a);
        System.out.println("Length: " + res);
    }
}
