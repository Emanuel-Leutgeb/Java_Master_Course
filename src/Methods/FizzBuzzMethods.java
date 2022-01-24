package Methods;

//Game FizzBuzz with methods
public class FizzBuzzMethods {
    public static void fizzBuzzMethods() {
        System.out.println("Let's play FizzBuzz.");
        boolean sayNumber;

        for (int i = 1; i < 101; i++) {
            sayNumber = true;

            if (i % 3 == 0 & i % 5 == 0) {
                //fizzBuzz();
                callName("FizzBuzz");
                sayNumber = false;
            } else if (i % 3 == 0) {
                //fizz();
                callName("Fizz");
                sayNumber = false;
            } else if (i % 5 == 0) {
                //buzz();
                callName("Buzz");
                sayNumber = false;
            }

            if (sayNumber) {
                System.out.println(i);
            }
        }
    }

    //Methods.Methods - Way 01
    private static void fizz() {
        System.out.println("Fizz");
    }

    private static void buzz() {
        System.out.println("Buzz");
    }

    private static void fizzBuzz() {
        System.out.println("FizzBuzz");
    }

    //Methods.Methods - Way 02
    private static void callName(String name) {
        System.out.println(name);
    }
}
