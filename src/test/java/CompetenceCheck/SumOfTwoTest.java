package CompetenceCheck;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {
    @Test
    void twoSumThreeShouldEqualFive() {
        HashSet<Integer> A = new HashSet<>(List.of(2));
        HashSet<Integer> B = new HashSet<>(List.of(3));
        int searchedNumber = 5;
        assertTrue(SumOfTwo.sumOfTwo(A, B, searchedNumber));
    }

    @Test
    void hundredSumFiftyShouldEqualFive() {
        HashSet<Integer> A = new HashSet<>(List.of(100));
        HashSet<Integer> B = new HashSet<>(List.of(50));
        int searchedNumber = 150;
        assertTrue(SumOfTwo.sumOfTwo(A, B, searchedNumber));
    }
}