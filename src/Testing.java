import java.util.Random;

public class Testing {
    public static void testing(){
        Random rnd = new Random();


        for (int i = 0; i < 500; i++){
            int rndNumber = rnd.nextInt(25) + 1; //von 01 bis 25
            System.out.println(rndNumber);
        }
    }
}
