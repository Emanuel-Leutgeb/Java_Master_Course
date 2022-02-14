package Inheritance;

public class Rectangle extends Shapes {

    private double width;
    private double length;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);

        if(width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if(width <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalArgumentException {
        if(length <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
