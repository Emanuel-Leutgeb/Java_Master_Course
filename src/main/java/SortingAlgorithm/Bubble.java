package SortingAlgorithm;

import java.util.Arrays;

//Bubble Sort
public class Bubble {
    public static void bubble() {
        int[] arr = {24, 22, 21, 13, 15, 18, 11, 9, 3, 2, -8, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, -14, 17, 24, 22, 21, 13, 15, 18, 11, 9, 3, 2, 8, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (1 + i); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Print array
        System.out.println(Arrays.toString(arr));
    }
}
