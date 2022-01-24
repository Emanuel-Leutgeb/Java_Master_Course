package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new UnitTesting();
        assertEquals(4, calculator.add(2, 2));
        //assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new UnitTesting();
        assertEquals(10, calculator.add(3, 7));
        //assertTrue(calculator.add(3, 7) == 10);
    }
}