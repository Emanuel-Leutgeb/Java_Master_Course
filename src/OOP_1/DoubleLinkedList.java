package OOP_1;

public class DoubleLinkedList {
    Node head = null;
    Node tail = null;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        System.out.println("Nodes of double linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {
        Node current = tail;
        if (head == null) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        System.out.println("Nodes of double linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void size() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        int length = 1;
        for (; current.next != null; length++) {
            current = current.next;
        }
        System.out.printf("Double linked list has a size of %d \n", length);
    }

    public void contains(int data) {    //int data
        Node current = head;
        if (head == null) {
            System.out.println("Double linked list is empty \n");
            return;
        }

        while (current != null) {
            if (current.data == data) {
                System.out.printf("Double linked list contains the %d \n", data);
                return;
            }
            current = current.next;
        }
        System.out.println();
    }

    public void remove(int element) {
        Node current = head;
        int count = 0;

        if (head == null) {
            System.out.println("Double linked list is empty \n");
            return;
        }

        while (current != null) {
            if (element == count) {
                if (head == current) {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                return;
            }
            current = current.next;
            count++;
        }
    }

    public void clear() {   //Clear List
//        head.next = tail;
//        tail.prev = head;
        head = null;
        tail = null;
        System.out.println("Double linked list is cleared");
    }
}