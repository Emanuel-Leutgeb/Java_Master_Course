package Games;

public class Multiplications {
    //Multiplications
    public static void multiplications() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("times %d \n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d \n", j, i, j * i);
            }
        }
    }
}
