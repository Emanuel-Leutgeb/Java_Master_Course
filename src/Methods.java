import java.util.Random;

public class Methods {

    //Game FizzBuzz with methods
    public static void fizzBuzzMethods(){
        System.out.println("Let's play FizzBuzz.");
        boolean sayNumber;

        for(int i = 1; i < 101; i++){
            sayNumber = true;

            if (i % 3 == 0 & i % 5 == 0){
                //fizzBuzz();
                callName("FizzBuzz");
                sayNumber = false;
            }
            else if (i % 3 == 0){
                //fizz();
                callName("Fizz");
                sayNumber = false;
            }
            else if (i % 5 == 0){
                //buzz();
                callName("Buzz");
                sayNumber = false;
            }

            if (sayNumber) {
                System.out.println(i);
            }
        }
    }

    //Methods - Way 01
    private static void fizz(){
        System.out.println("Fizz");
    }

    private static void buzz(){
        System.out.println("Buzz");
    }

    private static void fizzBuzz(){
        System.out.println("FizzBuzz");
    }

    //Methods - Way 02
    private static void callName(String name){
        System.out.println(name);
    }

    //Game of Life
    public static void gameOfLife() throws InterruptedException {
        System.out.println("Welcome to Game of Life");
        boolean[][] playground = playgroundSetup(); // true = Life & false = Dead


        while (true){
            /*
            System.out.println("With 'Q' you can Quit the Game.");
            String inputUser = Scanning.scan.nextLine();


            if (inputUser.equals("Q") || inputUser.equals("q")){
                //Game stop
                System.out.println("Game has stopped");
            }
            */

            printPlayground(playground);
            checkLife(playground);
            Thread.sleep(1000);
        }
        
    }

    private static boolean[][] playgroundSetup(){
        System.out.println("How big should be your Playground");
        int playgroundSize = Scanning.scan.nextInt();

        boolean[][] playground = new boolean[playgroundSize + 2][playgroundSize + 2];
        Random rnd = new Random();
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground.length; j++) {
                playground[i][j] = rnd.nextInt(10)<1;
            }
        }
        return playground;
    }

    private static void printPlayground(boolean[][] playground){
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground.length; j++) {
                if (i == 0 || j == 0 || i == playground.length - 1 || j == playground.length - 1){
                    System.out.print("#" + "\t");
                    playground[i][j] = false;
                }
                else if (playground[i][j]){
                    System.out.print("X" + "\t");
                }
                else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }

    private static void checkLife(boolean[][] playground){
        for (int i = 0; i < playground.length; i++){
            for (int j = 0; j < playground[i].length; j++){


                if (i == 0 || i == playground.length - 1){
                    break;
                }

                if (j == 0 || j == playground.length - 1){
                    continue;
                }
                int cells = 0;

                cells += playground[i - 1][j - 1] ? 1 : 0;
                cells += playground[i - 1][j] ? 1 : 0;
                cells += playground[i - 1][j + 1] ? 1 : 0;
                cells += playground[i][j - 1] ? 1 : 0;
                cells += playground[i][j + 1] ? 1 : 0;
                cells += playground[i + 1][j - 1] ? 1 : 0;
                cells += playground[i + 1][j] ? 1 : 0;
                cells += playground[i + 1][j + 1] ? 1 : 0;

                playground[i][j] = (playground[i][j] && (cells == 2 || cells == 3)) || ((!playground[i][j]) && cells == 3);
            }
        }
    }
}