package Inheritance;

public class Square extends Shapes {

    private double length;

    public Square(String color, boolean isFilled, double length) {
        super(color, isFilled);

        if(length <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double width) throws IllegalArgumentException {
        if(width <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.length = width;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
