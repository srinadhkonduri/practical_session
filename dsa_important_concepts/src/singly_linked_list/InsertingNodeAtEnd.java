package singly_linked_list;



public class InsertingNodeAtEnd {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class InsertAtEnd {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        public void insertAtFront(int val){
            Node temp = new Node(val);
            if (head == null){
                insertAtEnd(val);
            }
            else {
                temp.next = head;
                tail = temp;
            }
        }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int lengthOfElements(){
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();
        list.insertAtEnd(10);
        list.insertAtEnd(60);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
        list.insertAtFront(35);
        list.display();
        System.out.println(list.lengthOfElements());
    }
}
