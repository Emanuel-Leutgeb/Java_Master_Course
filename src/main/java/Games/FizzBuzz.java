package Games;

public class FizzBuzz {
    //Game FizzBuzz
    public static void fizzBuzz() {
        System.out.println("Let's play FizzBuzz.");
        boolean sayNumber;

        for (int i = 1; i < 101; i++) {
            sayNumber = true;

            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
                sayNumber = false;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                sayNumber = false;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                sayNumber = false;
            }

            if (sayNumber) {
                System.out.println(i);
            }
        }
    }
}
