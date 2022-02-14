package Inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    //Circle
    @Test
    void CircleAreaOneShouldEqualPi() {
        Shapes circle = new Circle("test", true, 1);
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void CirclePerimeterOneShouldEqualPiMultipliedTwo() {
        Shapes circle = new Circle("test", true, 1);
        assertEquals(Math.PI * 2, circle.getPerimeter());
    }

    @Test
    void CircleRadiusIsNull() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Circle("test", true, 0);
        });

        Assertions.assertEquals("Number is zero or negative", thrown.getMessage());
    }

    //Rectangle
    @Test
    void RectangleAreaOneMultipliedOneShouldEqualOne() {
        Shapes rectangle = new Rectangle("test", true, 1, 1);
        assertEquals(1, rectangle.getArea());
    }

    @Test
    void RectanglePerimeterOneAndOneShouldEqualFour() {
        Shapes rectangle = new Rectangle("test", true, 1, 1);
        assertEquals(4, rectangle.getPerimeter());
    }

    @Test
    void RectangleWidthIsNull() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("test", true, 0,1);
        });

        Assertions.assertEquals("Number is zero or negative", thrown.getMessage());
    }

    @Test
    void RectangleLengthIsNull() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("test", true, 1,0);
        });

        Assertions.assertEquals("Number is zero or negative", thrown.getMessage());
    }

    //Square
    @Test
    void SquareAreaOneMultipliedOneShouldEqualOne() {
        Shapes square = new Square("test", true, 1);
        assertEquals(1, square.getArea());
    }

    @Test
    void SquarePerimeterOneAndOneShouldEqualFour() {
        Shapes square = new Square("test", true, 1);
        assertEquals(4, square.getPerimeter());
    }

    @Test
    void SquareLengthIsNull() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Square("test", true, 0);
        });

        Assertions.assertEquals("Number is zero or negative", thrown.getMessage());
    }
}