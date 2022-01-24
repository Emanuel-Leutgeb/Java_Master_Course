package CompetenceCheck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Sum of Two
public class SumOfTwo {
    public static void sumOfTwoTest() {
        HashSet<Integer> A = new HashSet<>(List.of(2));
        HashSet<Integer> B = new HashSet<>(List.of(3));
        int searchedNumber = 5;
        System.out.println(sumOfTwo(A, B, searchedNumber));
    }

    public static boolean sumOfTwo(HashSet<Integer> A, HashSet<Integer> B, int searchedNumber) {
        Iterator<Integer> it = A.iterator();
        while (it.hasNext()) {
            int i = it.next();
            int targetNumber = searchedNumber - i;
            if (B.contains(targetNumber)) {
                return true;
            }
        }
        return false;
    }
}
