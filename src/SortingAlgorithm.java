import java.util.Arrays;

public class SortingAlgorithm {

    //Insertion sort
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

    //Bubble Sort
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

    //Divide and Conquer
    public static void divideAndConquer() {
        int[] arr = {24, 22, 21, 13, 15, 18, 11, 9, 3, 2, -8, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, -14, 17, 24, 22, 21, 13, 15, 18, 11, 9, 3, 2, 8, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17};

        System.out.println("Unsorted");
        //Print array
        System.out.println(Arrays.toString(arr));

        //sort(arr, 0, arr.length - 1);
        splitArray(arr, 0, arr.length - 1); //leftSide 0; rightSide last element of array

        System.out.println("\nSorted");
        //Print array
        System.out.println(Arrays.toString(arr));
    }


    private static void splitArray(int[] arr, int leftSide, int rightSide) {
        if (leftSide < rightSide) { //termination condition for recursion
            int middlePoint = leftSide + (rightSide - leftSide) / 2; //

            splitArray(arr, leftSide, middlePoint); //Recursion for left side
            splitArray(arr, middlePoint + 1, rightSide); //Recursion for right side

            sort(arr, leftSide, middlePoint, rightSide); // Sort
        }
    }

    private static void sort(int[] arr, int leftSide, int middlePoint, int rightSide) {
        //create temp array
        int[] leftSideArray = new int[middlePoint - leftSide + 1];
        int[] rightSideArray = new int[rightSide - middlePoint];

        //copy data from arr to temp array
        for (int i = 0; i < leftSideArray.length; ++i) //sizeTempArray1
            leftSideArray[i] = arr[leftSide + i];
        for (int j = 0; j < rightSideArray.length; ++j) //sizeTempArray2
            rightSideArray[j] = arr[middlePoint + 1 + j];

        //counter number
        int leftIndex = 0;
        int rightIndex = 0;

        // Initial index of merged subarray array
        int originalIndex = leftSide;
        while (leftIndex < leftSideArray.length && rightIndex < rightSideArray.length) {
            if (leftSideArray[leftIndex] <= rightSideArray[rightIndex]) {
                arr[originalIndex] = leftSideArray[leftIndex];
                leftIndex++;
            } else {
                arr[originalIndex] = rightSideArray[rightIndex];
                rightIndex++;
            }
            originalIndex++;
        }

        //copy remaining elements of leftSideArray if any
        while (leftIndex < leftSideArray.length) {
            arr[originalIndex] = leftSideArray[leftIndex];
            leftIndex++;
            originalIndex++;
        }

        //copy remaining elements of rightSideArray if any
        while (rightIndex < rightSideArray.length) {
            arr[originalIndex] = rightSideArray[rightIndex];
            rightIndex++;
            originalIndex++;
        }
    }
}
