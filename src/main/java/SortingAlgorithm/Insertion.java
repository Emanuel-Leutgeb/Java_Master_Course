package SortingAlgorithm;

import java.util.Arrays;

//Insertion sort
public class Insertion {
    public static void insertion() {
        //random array
        int[] arr = {24, 22, 21, 13, 15, 18, 11, 9, 3, 2, 8, -12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17, 24, 22, 21, 13, 15, 18, -11, 9, 3, 2, 8, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17};

        //sorting
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        //Print array
        System.out.println(Arrays.toString(arr));
    }
}
