package OOP_2;

import OOP_1.DoubleLinkedList;

public class Stack {
    private DoubleLinkedList list;

    public Stack(){
        list = new DoubleLinkedList();
    }

    public void push(Integer data) {
        list.add(data);
    }

    public Integer size() {
        return list.size();
    }

    public Integer pop() {
        Integer data = list.getReverse(0);
        list.removeReverse(0);
        return data;
    }

    public Integer peek() {
        return list.getReverse(0);
    }

    public Integer[] pop(Integer n) {
        Integer[] data = new Integer[n];
        for(int i = 0; i < n; i++){
            Integer temp = list.getReverse(0);
            list.removeReverse(0);
            data[i] = temp;
        }
        return data;
    }

    @Override
    public String toString() {
        return "" + list;
    }
}