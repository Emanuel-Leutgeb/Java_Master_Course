package Games;

import Scanning.Scanning;
import java.util.ArrayList;
import java.util.Collections;

//Maxima calculation
public class MaximaCalculation {
    public static void maximaCalculation() {
        boolean addToList;
        int myNumber = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            addToList = false;
            System.out.println("Please enter a number or press 'q' to get the maximum");
            String myString = Scanning.scan.next();

            if (myString.equals("q") || myString.equals("Q")) {
                break;
            }

            try {
                myNumber = Integer.parseInt(myString);
                addToList = true;
            } catch (NumberFormatException NoSuchElementException) {
                System.out.println("Please enter a correct number");
            }

            if (addToList) {
                numbers.add(myNumber);
                for (int j : numbers) {
                    System.out.println(j);
                }
            }
            System.out.println("The max value is: " + Collections.max(numbers));
        }
    }
}
