package Inheritance;

public class Circle extends Shapes {

    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);

        if(radius <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if(radius <= 0) {
            throw new IllegalArgumentException("Number is zero or negative");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
