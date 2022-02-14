package Datastructures;

import java.util.ArrayList;
import java.util.Arrays;

//Sorting algorithm with ArrayList
public class BubbleArrayList {
    public static void bubbleArrayList() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        int temp;
        for (int i = 0; i < arr.get(arr.size() - 1); i++) {
            for (int j = 0; j < arr.size() - (1 + i); j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j + 1);
                    arr.remove(j + 1);
                    arr.add(j + 1, arr.get(j));
                    arr.remove(j + 1);
                    arr.add(j, temp);
                }
            }
        }
        System.out.println(arr);
    }
}
