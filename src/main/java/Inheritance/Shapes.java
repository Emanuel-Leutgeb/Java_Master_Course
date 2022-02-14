package Inheritance;

public abstract class Shapes {

    private String color;
    private boolean isFilled;

    public Shapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}

