package Testing;

public class Testing {
    private final Node head;    //final because it's should not be changed
    private final Node tail;    //final because it's should not be changed
    private static int size;

    public Testing() {
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }

    class Node {
        private int data;
        private Node prev;
        private Node next;

        Node(int data) {
            this.data = data;
            size++;
        }

        Node() {
            //empty constructor for main constructor
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head.next == tail) {
            //Pointer NEXT to new node from HEAD
            head.next = newNode;
            //Pointer PREV to new node from TAIL
            tail.prev = newNode;
            //Pointer NEXT to TAIL from new node
            newNode.next = tail;
            //Pointer PREV to HEAD from new node
            newNode.prev = head;
        } else {
            //Pointer NEXT from tail.prev points now to new Node
            tail.prev.next = newNode;
            //Pointer PREV from new node points now to tail.prev (new element prev points to old (tail.prev) element)
            newNode.prev = tail.prev;
            //Pointer PREV from tail.prev points now to new Node
            tail.prev = newNode;
            //Pointer NEXT from new node points to tail
            newNode.next = tail;
        }
    }

    public void print() {
        Node current = head.next;
        if (head.next == tail) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        System.out.println("Nodes of double linked list: ");
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {
        Node current = tail.prev;
        if (head.next == tail) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        System.out.println("Nodes of double linked list: ");
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void size() {
        System.out.printf("Double linked list has a size of %d \n", size);
    }

    public void contains(int data) {    //int data
        Node current = head.next;
        if (head.next == tail) {
            System.out.println("Double linked list is empty \n");
            return;
        }

        while (current != tail) {
            if (current.data == data) {
                System.out.printf("Double linked list contains the data: '%d' \n", data);
                return;
            }
            current = current.next;
        }
        System.out.println();
    }

    public void remove(int element) {
        Node current = head.next;
        int count = 0;

        if (head.next == tail) {
            System.out.println("Double linked list is empty \n");
            return;
        }
        if (element >= size || element < 0) {
            System.out.println("Index out of Bounds");
            return;
        }

        while (current != tail) {
            if (element == count) {
                if (head.next == current) {
                    head.next = current.next;
                }
                if (current.next != tail) {
                    current.next.prev = current.prev;
                }
                if (current.prev != head) {
                    current.prev.next = current.next;
                }
                size--;
                System.out.println("Removed");
                return;
            }
            current = current.next;
            count++;
        }
    }

    public void clear() {
        head.next = tail;
        tail.prev = head;
        size = 0;
        System.out.println("Double linked list is cleared");
    }
}