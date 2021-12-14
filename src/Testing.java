import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Testing {
    public static void testing(){
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 500; i++){
            int rndNumber = rnd.nextInt(15) + 61; //von XX bis XX
            System.out.println(rndNumber);
            numbers.add(rndNumber);
            for(int j : numbers){
                System.out.println(j);
            }
            System.out.println("The max value is: " + Collections.min(numbers));
            System.out.println("The max value is: " + Collections.max(numbers));
        }
    }
}
