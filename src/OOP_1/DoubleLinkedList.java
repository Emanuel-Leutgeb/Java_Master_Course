package OOP_1;

public class DoubleLinkedList {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d, Node previous) {
            data = d;
            next = null;
            prev = previous;
        }
    }

    public static void doubleLinkedList() {

        DoubleLinkedList myList = new DoubleLinkedList();

        myList.head = new DoubleLinkedList.Node(0, null);
        Node firstElement = new Node(1, myList.head);
        Node secondElement = new Node(2, firstElement);
        Node thirdElement = new Node(3, secondElement);
        Node fourthElement = new Node(4, thirdElement);

        myList.head.next = firstElement;
        firstElement.next = secondElement;
        secondElement.next = thirdElement;
        thirdElement.next = fourthElement;

        //print list forward
        for (Node element = myList.head; element != null; element = element.next) {
            System.out.println(element.data);
        }

        //appendChild
        Node fifthElement = new Node(5, null);
        Node lastElement = myList.head;
        while (lastElement.next != null) {
            lastElement = lastElement.next;
        }
        lastElement.next = fifthElement;
        fifthElement.prev = lastElement;

        //print list backward
        for (lastElement = myList.head; lastElement.next != null; lastElement = lastElement.next){
        }

        System.out.println("Print list backward.");
        for (lastElement = lastElement; lastElement != null; lastElement = lastElement.prev) {
            System.out.println(lastElement.data);
        }

    }
}

