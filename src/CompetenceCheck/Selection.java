package CompetenceCheck;

import java.util.Arrays;

public class Selection {
    //Selection sort
    public static void selection() {
        int[] arr = {24, 22, 21, 13, 15, 18, 11, 9, 3, 2, 8, 12, -1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17, 24, 22, 0, 21, 13, -15, 18, 11, 9, 3, 2, 8, 0, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17};

        for (int i = 0; i < arr.length - 1; i++) {

            int lowestNumber = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestNumber])
                    lowestNumber = j;
            }
            int temp = arr[lowestNumber];
            arr[lowestNumber] = arr[i];
            arr[i] = temp;
        }
        //Print array
        System.out.println(Arrays.toString(arr));
    }
}
