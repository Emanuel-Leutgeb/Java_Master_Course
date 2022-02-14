package OOP_1;

//This Double Linked List was created by the Trainer Alexander and Emanuel.

public class DoubleLinkedListTwo<T> {
    private final Node<T> head;
    private final Node<T> tail;
    private static int size;

    public DoubleLinkedListTwo() {
        head = new Node<T>(null);
        tail = new Node<T>(null);

        head.next = tail;
        tail.prev = head;

        head.prev = null;
        tail.next = null;
    }

    class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
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
        size++;
    }

    public T get(Integer index) {
        Node<T> current = head.next;
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

    public T getReverse(Integer index) {
        Node<T> current = tail.prev;
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
        Node<T> current = head.next;
        while (current != tail) {
            stringBuilder.append(current.data + " ");
            current = current.next;
        }
        return stringBuilder.toString();
    }

    public void printReverse() {
        Node<T> current = tail.prev;
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public Integer size() {
        return size;
    }

    public boolean contains(T data) {
        Node<T> current = head.next;
        while (current != tail) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(Integer index) {
        Node<T> current = head.next;
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
        Node<T> current = tail.prev;
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