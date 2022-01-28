package OOP_1;

public class DoubleLinkedList {
    private final Node head;
    private final Node tail;
    private static Integer size = 0;

    public DoubleLinkedList() {
        head = new Node(null);
        tail = new Node(null);

        head.next = tail;
        tail.prev = head;
    }

    class Node {
        private Integer data;
        private Node prev;
        private Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    public void add(Integer data) {
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
            //Pointer PREV from new node points now to tail.prev (new element prev points to old (intail.prev) element)
            newNode.prev = tail.prev;
            //Pointer PREV from tail.prev points now to new Node
            tail.prev = newNode;
            //Pointer NEXT from new node points to tail
            newNode.next = tail;
        }
        size++;
    }

    public Integer get(Integer index) {
        Node current = head.next;
        Integer count = 0;

        if (head.next == tail || index < 0 || index >= size) {
            return null;
        }

        while (current != tail) {
            if (index.equals(count)) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    public Integer getReverse(Integer index) {
        Node current = tail.prev;
        Integer count = 0;

        if (head.next == tail || index < 0 || index >= size) {
            return null;
        }

        while (current != head) {
            if (index.equals(count)) {
                return current.data;
            }
            current = current.prev;
            count++;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head.next;
        while (current != tail) {
            stringBuilder.append(current.data + " ");
            current = current.next;
        }
        return stringBuilder.toString();
    }

    public void printReverse() {
        Node current = tail.prev;
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public Integer size() {
        return size;
    }

    public boolean contains(Integer data) {
        Node current = head.next;
        while (current != tail) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(Integer index) {
        Node current = head.next;
        Integer count = 0;

        if (head.next == tail || index >= size || index < 0) {
            return;
        }

        while (current != tail) {
            if (index.equals(count)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return;
            }
            current = current.next;
            count++;
        }
    }

    public void removeReverse(Integer index) {
        Node current = tail.prev;
        Integer count = 0;

        if (head.next == tail || index >= size || index < 0) {
            return;
        }

        while (current != head) {
            if (index.equals(count)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return;
            }
            current = current.prev;
            count++;
        }
    }

    public void clear() {
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
}