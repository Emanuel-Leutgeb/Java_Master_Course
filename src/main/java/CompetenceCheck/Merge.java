package CompetenceCheck;

import java.util.Arrays;
import java.util.Random;

//Merge Sort
public class Merge {
    public static void merge() {
        //fill arr with random numbers from -50 to 100 with 50 different numbers
        Random random = new Random();
        int[] arr = random.ints(4, -50, 100).toArray();

        //Print array
        System.out.println("Unsorted\n" + Arrays.toString(arr));

        //sort(arr, 0, arr.length - 1);
        splitArray(arr, 0, arr.length - 1); //leftSide 0; rightSide last element of array

        //Print array
        System.out.println("\nSorted\n" + Arrays.toString(arr));
    }

    private static void splitArray(int[] arr, int leftSide, int rightSide) {
        if (leftSide < rightSide) { //termination condition for recursion
            int middlePoint = leftSide + (rightSide - leftSide) / 2;

            splitArray(arr, leftSide, middlePoint); //Recursion for left side
            splitArray(arr, middlePoint + 1, rightSide); //Recursion for right side

            sort(arr, leftSide, middlePoint, rightSide); // Sort
        }
    }

    private static void sort(int[] arr, int leftSide, int middlePoint, int rightSide) {
        //create temp array
        int[] leftSideArray = new int[middlePoint - leftSide + 1];
        int[] rightSideArray = new int[rightSide - middlePoint];

        //Way 2 by Alex with <3
        //int[] leftArray = Arrays.copyOfRange(arr, 0, arr.length / 2); //better for understanding
        //arr | 0 is incl. | arr.length / 2 is excl.
        //int[] rightArray = Arrays.copyOfRange(arr, arr.length / 2, arr.length); //better for understanding

        //copy data from arr to temp array
        for (int i = 0; i < leftSideArray.length; ++i) //sizeTempArray1
            leftSideArray[i] = arr[leftSide + i];
        for (int j = 0; j < rightSideArray.length; ++j) //sizeTempArray2
            rightSideArray[j] = arr[middlePoint + 1 + j];

        //counter number
        int leftIndex = 0;
        int rightIndex = 0;

        // Initial index of merged subarea array
        int originalIndex = leftSide;
        while (leftIndex < leftSideArray.length && rightIndex < rightSideArray.length) { //as long as it is on the correct place
            if (leftSideArray[leftIndex] <= rightSideArray[rightIndex]) { // check if number is smaller or bigger
                arr[originalIndex] = leftSideArray[leftIndex];
                leftIndex++;
            } else {
                arr[originalIndex] = rightSideArray[rightIndex];
                rightIndex++;
            }
            originalIndex++;
        }

        //copy remaining elements of leftSideArray
        while (leftIndex < leftSideArray.length) {
            arr[originalIndex] = leftSideArray[leftIndex]; //from temp left to the original
            leftIndex++;
            originalIndex++;
        }

        //copy remaining elements of rightSideArray
        while (rightIndex < rightSideArray.length) {
            arr[originalIndex] = rightSideArray[rightIndex]; //from temp right to the original
            rightIndex++;
            originalIndex++;
        }
    }
}
