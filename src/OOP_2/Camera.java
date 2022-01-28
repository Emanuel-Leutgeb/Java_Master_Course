package OOP_2;

public class Camera {
    private String brand;
    private int megaPixels;
    private double displaySize;
    private boolean colored;
    private Lens lens;
    //counter
    public static int instantiationCamera;

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Camera(String brand, int megaPixels, double displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        //counter
        instantiationCamera++;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                ", instantiationCamera=" + instantiationCamera +
                '}';
    }
}
