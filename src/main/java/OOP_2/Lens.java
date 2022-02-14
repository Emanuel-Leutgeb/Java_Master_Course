package OOP_2;

import Scanning.Scanning;

public class Lens {
    private int minFocalLength;
    private int maxFocalLength;
    //counter
    public static int instantiationLens;

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        while (minFocalLength < maxFocalLength){
            System.out.printf("Min Focal Length cannot be bigger! \n" +
                    "Maximum is %d: ...\n", getMaxFocalLength());
            minFocalLength = Scanning.scan.nextInt();
        }
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        while (maxFocalLength < minFocalLength){
            System.out.printf("Max Focal Length cannot be smaller! \n" +
                    "Minimal is %d: ...\n", getMinFocalLength());
            maxFocalLength = Scanning.scan.nextInt();
        }
        this.maxFocalLength = maxFocalLength;
    }

    public Lens(int minFocalLength, int maxFocalLength) {
        this.minFocalLength = minFocalLength;

        while (maxFocalLength < minFocalLength){
            System.out.printf("Max Focal Length cannot be smaller! \n" +
                    "Minimal is %d: ...\n", getMinFocalLength());
            maxFocalLength = Scanning.scan.nextInt();
        }
        this.maxFocalLength = maxFocalLength;

        //counter
        instantiationLens++;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                ", instantiationLens=" + instantiationLens +
                '}';
    }
}
