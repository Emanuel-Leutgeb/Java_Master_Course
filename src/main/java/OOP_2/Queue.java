package OOP_2;

import OOP_1.DoubleLinkedList;

public class Queue {
    private DoubleLinkedList list;

    public Queue() {
        list = new DoubleLinkedList();
    }

    public void enqueue(Integer data) {
        list.add(data);
    }

    public Integer size() {
        return list.size();
    }

    public Integer dequeue() {
        Integer data = list.get(0);
        list.remove(0);
        return data;
    }

    public Integer[] dequeue(Integer n) {
        Integer[] data = new Integer[n];
        for(int i = 0; i < n; i++){
            Integer temp = list.get(0);
            list.remove(0);
            data[i] = temp;
        }
        return data;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "list=" + list +
                '}';
    }
}